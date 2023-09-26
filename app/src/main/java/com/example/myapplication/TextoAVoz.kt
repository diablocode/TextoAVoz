package com.example.myapplication

import android.content.Context
import android.speech.tts.TextToSpeech
import java.util.Locale

class TextoAVoz(context: Context) : TextToSpeech.OnInitListener {
    lateinit var context: Context
    lateinit var textToSpeech:TextToSpeech
    init {
        this.context = context
        textToSpeech = TextToSpeech(context, this)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS){
            textToSpeech.setLanguage(Locale.GERMAN)
        }
    }

    fun habla(mensaje: String){
        textToSpeech.speak(mensaje, TextToSpeech.QUEUE_FLUSH, null, null)
    }
}