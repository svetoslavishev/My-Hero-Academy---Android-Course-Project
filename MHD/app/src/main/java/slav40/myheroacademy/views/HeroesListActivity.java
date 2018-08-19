package slav40.myheroacademy.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import slav40.myheroacademy.models.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import slav40.myheroacademy.R;

public class HeroesListActivity extends AppCompatActivity
{
    private ListView mHeroesListView;
    private List<Character> heroes;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_list);

        Character deku = new Character("Deku",
                "Izuku Midoriya",
                "Izuku Midoriya is the main protagonist of My Hero Academia. All Might passed on his quirk to Izuku, making him the ninth owner of the Quirk One For All.",
                R.drawable.deku,
                R.drawable.deku_full);

        Character allMight = new Character("All Might",
                "Toshinori Yagi",
                "Toshinori Yagi, most commonly known by his hero name All Might, is the former No. 1 Hero who bore the title of the world's Symbol of Peace. He teaches Foundational Hero Studies at U.A. High School.",
                R.drawable.all_might,
                R.drawable.all_might_full);

        Character kacchan = new Character("Kacchan",
                "Katsuki Bakugo",
                "Katsuki Bakugo is a student training to become a Pro Hero at U.A. High School. Quirk: Explosion. Katsuki's Quirk allows him to secrete nitroglycerin-like sweat from his palms and detonate it at will to create explosions.",
                R.drawable.bakugo,
                R.drawable.bakugo_full);

        Character shoto = new Character("Shoto",
                "Shoto Todoroki",
                "Shoto Todoroki is a student at U.A. High School training to become a Pro Hero. Quirk: Half-Cold Half-Hot. Half-Cold Half-Hot allows Shoto to generate ice from the right side of his body and flames from the left.",
                R.drawable.shoto,
                R.drawable.shoto_full);

        Character midnight = new Character("Midnight",
                "Nemuri Kayama",
                "Nemuri Kayama (Midnight) is a Pro Hero and faculty member at U.A. High School. Quirk: Somnambulist. Her Quirk allows her to put targets to sleep by exuding a sleep-inducing aroma from her body.",
                R.drawable.midnight,
                R.drawable.midnight_full);

        Character mtLady = new Character("Mt.Lady",
                "Yu Takeyama",
                "Yu Takeyama also known as the hero Mt. Lady, is the No.23 Pro Hero. Quirk: Gigantification. Mt. Lady's Quirk allows her to grow to a gigantic size. She could grow up to 2062 cm tall.",
                R.drawable.mt_lady,
                R.drawable.mt_lady_full);

        heroes = new ArrayList<>();
        heroes.addAll(Arrays.asList(allMight, deku, kacchan, shoto, midnight, mtLady));

        mHeroesListView = findViewById(R.id.lv_heroes);

        CustomAdapter customAdapter = new CustomAdapter();
        mHeroesListView.setAdapter(customAdapter);

        mHeroesListView.setOnItemClickListener((adapterView, view, i, l) ->
        {
            Intent intent = new Intent(getApplicationContext(), CharacterDetailsActivity.class);
            intent.putExtra("name", heroes.get(i).getRealName());
            intent.putExtra("description", heroes.get(i).getDescription());
            intent.putExtra("image", heroes.get(i).getDetailedImgURL());
            startActivity(intent);
        });
    }

    private class CustomAdapter extends BaseAdapter
    {
        @Override
        public int getCount()
        {
            return heroes.size();
        }

        @Override
        public Object getItem(int i)
        {
            return null;
        }

        @Override
        public long getItemId(int i)
        {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            View view1 = getLayoutInflater().inflate(R.layout.row_data, null);

            TextView name = view1.findViewById(R.id.heroes);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(heroes.get(i).getName());
            image.setImageResource(heroes.get(i).getImgURL());

            return view1;
        }
    }
}
