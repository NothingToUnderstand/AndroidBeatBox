package com.example.beatbox.model

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

internal class SoundViewModelTest {

    private lateinit var sound: Sound
    private lateinit var subject: SoundViewModel
    @Mock
    private lateinit var beatBox: BeatBox
    @Before
    fun setUp() {
        sound = Sound("assetPath")
        beatBox = mock(BeatBox::class.java)
        subject = SoundViewModel(beatBox)
        subject.sound = sound

    }

    @Test
    fun exposesSoundNameAsTitle() {
        assertThat(subject.title, `is`(sound.name))
    }

    }
