import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.asn8.topgames.R

class GameAdapter(val gameList: ArrayList<GameModel>) : RecyclerView.Adapter<GameAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gameImg: ImageView
        val gameText : TextView

        init {
            gameImg = itemView.findViewById(R.id.cardViewImg)
            gameText = itemView.findViewById(R.id.cardText)

            itemView.setOnClickListener(){
                Toast.makeText(itemView.context,"You clicked on ${gameList.get(adapterPosition).GmText}",Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameAdapter.MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itemcardview,parent,false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: GameAdapter.MyViewHolder, position: Int) {
        holder.gameText.setText(gameList[position].GmText)
        holder.gameImg.setImageResource(gameList[position].img)

    }

    override fun getItemCount(): Int {
        return gameList.size
    }

}