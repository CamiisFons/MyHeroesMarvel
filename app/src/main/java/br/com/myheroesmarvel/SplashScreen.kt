package br.com.myheroesmarvel

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import pl.droidsonroids.gif.GifImageView

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        gifAnimation()
    }

    private fun gifAnimation() {
        val gifSplash = findViewById<GifImageView>(R.id.marvel)
        Handler(Looper.getMainLooper()).postDelayed({
            gifSplash.animate().apply {
                duration = 2000
                alpha(0f)
            }
        },3000)

        Handler(Looper.getMainLooper()).postDelayed({
            showHeroActivity()
        },6000)
    }

    private fun showHeroActivity(){
        val intentShow = Intent(this,HeroActivity::class.java)
        startActivity(intentShow)
        finish()
    }
}