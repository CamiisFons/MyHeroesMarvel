package br.com.myheroesmarvel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.myheroesmarvel.databinding.CharactersItemBinding
import br.com.myheroesmarvel.model.CharactersResults
import com.bumptech.glide.Glide

class CharactersAdapter(val charactersList:MutableList<CharactersResults>): RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        return CharactersViewHolder(CharactersItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        )
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.binding(charactersList[position])
    }

    override fun getItemCount(): Int {
        return charactersList.size
    }

    inner class CharactersViewHolder(val charactersItemBinding: CharactersItemBinding) :
        RecyclerView.ViewHolder(charactersItemBinding.root) {

            fun binding(charactersResults:CharactersResults){
                charactersItemBinding.heroTV.text = charactersResults.name
                Glide.with(charactersItemBinding.heroIV)
                    .load(charactersResults.thumbnail.path)
                    .circleCrop()
                    .into(charactersItemBinding.heroIV)
            }
    }


}