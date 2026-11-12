package kr.ac.kumoh.s2025112622.w26w10_controller.repository

import kr.ac.kumoh.s2025112622.w26w10_controller.model.Song


interface SongRepository {
    fun findAll() : List<Song>
}