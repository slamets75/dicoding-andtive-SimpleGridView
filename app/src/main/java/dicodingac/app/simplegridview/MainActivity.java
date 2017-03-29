package dicodingac.app.simplegridview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private String[] images = new String[]{
            "https://images8.alphacoders.com/392/392448.png",
            "http://cdn.animeherald.com/aniheraldcdn/2016/08/All-Out-Anime-Visual-002-20160824.jpg",
            "http://images5.fanpop.com/image/photos/31100000/Bakuman-bakuman-31105011-452-640.jpg",
            "http://images6.fanpop.com/image/photos/32200000/usuitakumi77-fairy-tail-32230745-1600-1200.jpg",
            "https://juegosmobile.net/wp-content/uploads/2015/08/Dragon-Ball-Super.jpg",
            "http://2.bp.blogspot.com/-L6Fj3jD-M2w/TtEUB09pkaI/AAAAAAAAAV0/iPtbur4eZvE/s1600/naruto_manga_cover_v42.jpg",
            "http://images2.fanpop.com/images/photos/5800000/One-Piece-one-piece-5844241-1600-1200.jpg",
            "http://img15.deviantart.net/d22d/i/2014/157/4/5/sao___kirito_wallpaper_by_conorsta-d7l458z.png",
            "http://1.bp.blogspot.com/-OFKBR4NHCqI/Tmao1_NmxnI/AAAAAAAAS5c/qADNXZv3rV4/s1600/1.jpg",
            "http://assets.vg247.com/current/2015/06/yu-gi-oh_generic_image.jpg"
    };

    private GridView gvItem;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Anime Favorite");
        gvItem = (GridView) findViewById(R.id.gv_item);
        ItemGridAdapter itemGridAdapter = new ItemGridAdapter(MainActivity.this, images);
        gvItem.setAdapter(itemGridAdapter);
        gvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view,
                                    int position, long id) {
             DetailImageActivity.toDetailImageActivity(MainActivity.this, images[position]);}

        });

    }

@Override
 public boolean onCreateOptionsMenu(Menu menu) {
   getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
      }

 @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_staggered) {
       StaggeredGridActivity.toStaggeredGridActivity(MainActivity.this);
      return true;

           }
         return super.onOptionsItemSelected(item);
        }
}
