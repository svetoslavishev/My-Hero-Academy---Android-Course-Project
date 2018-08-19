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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import slav40.myheroacademy.R;
import slav40.myheroacademy.models.Character;

public class VillainsListActivity extends AppCompatActivity
{
    private ListView mVillainsListView;
    private List<Character> mVillains;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villains_list);

        // VILLAINS

        Character allForOne = new Character("All For One",
                "All For One",
                "All For One is the true leader and benefactor of the League of Villains and the central antagonist of the series. Quirk: All For One. His Quirk allows him to steal people's Quirks and renders them his own.",
                R.drawable.all_for_one,
                R.drawable.all_for_one_full);

        Character shigaraki = new Character("Shigaraki",
                "Tenko Shimura",
                "Tomura Shigaraki, real name Tenko Shimura, is a villain, the acting leader of the League of Villains. Quirk: Decay. Tomura's Quirk allows him to decay whatever he touches with his hands.",
                R.drawable.shigaraki,
                R.drawable.shigaraki_full);

        Character stain = new Character("Stain",
                "Chizome Akaguro",
                "Chizome Akaguro (Hero Killer: Stain), is a villain and ex-vigilante that is notorious for having killed many pro heroes. Quirk: Bloodcurdle. Chizome can paralyze his target by ingesting samples of their blood.",
                R.drawable.stain,
                R.drawable.stain_full);

        Character himiko = new Character("Himiko",
                "Himiko Toga",
                "Himiko Toga is a major supporting character and a member of the League of Villains. Quirk: Transform. Her Quirk allows her to take on the complete physical appearance of another living being.",
                R.drawable.himiko,
                R.drawable.himiko_full);

        Character dabi = new Character("Dabi",
                "Dabi",
                "Dabi is a villain affiliated with the League of Villains and a member of the organization's Vanguard Action Squad. Quirk: Cremation. His quirk grants him the ability to generate blue flames from his body.",
                R.drawable.dabi,
                R.drawable.dabi_full);

        mVillains = new ArrayList<>();
        mVillains.addAll(Arrays.asList(allForOne, shigaraki, stain, himiko, dabi));

        mVillainsListView = findViewById(R.id.lv_villains);

        CustomAdapter customAdapter = new CustomAdapter();
        mVillainsListView.setAdapter(customAdapter);

        mVillainsListView.setOnItemClickListener((adapterView, view, i, l) ->
        {
            Intent intent = new Intent(getApplicationContext(), CharacterDetailsActivity.class);
            intent.putExtra("name", mVillains.get(i).getRealName());
            intent.putExtra("description", mVillains.get(i).getDescription());
            intent.putExtra("image", mVillains.get(i).getDetailedImgURL());
            startActivity(intent);
        });
    }

    private class CustomAdapter extends BaseAdapter
    {
        @Override
        public int getCount()
        {
            return mVillains.size();
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

            name.setText(mVillains.get(i).getName());
            image.setImageResource(mVillains.get(i).getImgURL());

            return view1;
        }
    }
}
