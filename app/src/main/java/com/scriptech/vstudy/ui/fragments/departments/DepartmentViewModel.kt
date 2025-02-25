package com.scriptech.vstudy.ui.fragments.departments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.scriptech.vstudy.model.Books
import com.scriptech.vstudy.model.DepartmentModel
import com.scriptech.vstudy.model.Videos
import com.scriptech.vstudy.repository.NotesRepository

class DepartmentViewModel(val notesRepository: NotesRepository) : ViewModel() {

    suspend fun getAllSubjects(dept_link: String) = notesRepository.getAllSubjects(dept_link)

}