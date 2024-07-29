package com.example.tescompose.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tescompose.data.StudioGhibliMovies.ghiblis
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class MainViewModel : ViewModel() {
    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val _ghibli = MutableStateFlow(ghiblis)
    val ghibli = searchText
        .combine(_ghibli) { text, ghiblis ->
            if (text.isBlank()) {
                ghiblis
            } else {
                ghiblis.filter {
                    it.doesMatchSearchQuery(text)
                }
            }
        }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _ghibli.value
        )

    fun onSearchTextChange(text: String) {
        _searchText.value = text
    }
}