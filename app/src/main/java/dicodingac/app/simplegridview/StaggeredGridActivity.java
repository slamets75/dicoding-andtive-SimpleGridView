package dicodingac.app.simplegridview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.etsy.android.grid.StaggeredGridView;

public class StaggeredGridActivity extends AppCompatActivity {

    private StaggeredGridView staggeredGridView;
    private String[] items = new String[]{
            "http://www.kertashitam.com/adminkertashitamxjtwo/uploadpost/[coretanharian.com]-one-piece-logo.jpg",
            "http://g02.a.alicdn.com/kf/HTB1Q2xDMXXXXXagapXXq6xXFXXXp/Free-shipping-One-Piece-font-b-Luffy-b-font-font-b-Cosplay-b-font-Costume.jpg",
            "https://lh3.googleusercontent.com/-lz1UNzjZwpE/V2Swu8_IsII/AAAAAAAAAc0/sLKxutEjDRIBr6Bmy4qM2ii4o2aoPzFww/w800-h800/2.png",
            "https://i.kinja-img.com/gawker-media/image/upload/s--nFxGt3L5--/c_scale,f_auto,fl_progressive,q_80,w_800/ebaeet1udzknntbtepj6.jpg",
            "http://4.bp.blogspot.com/-GwuvOrHmN3Y/UPkQJ9VUX1I/AAAAAAAAVfc/lTneT2BFHuA/s1600/1PPW2_02.jpg",
            "https://lh3.googleusercontent.com/-jGORMpgTAAI/Vi6RCoOrQtI/AAAAAAAACgk/GYBqQ2Pu278/w1024-h579/the%2Bfeellsss.jpg",
            "https://s-media-cache-ak0.pinimg.com/736x/4b/e6/e8/4be6e87a6e2a0469550c23b597d16d79.jpg",
            "http://static.zerochan.net/Straw.Hat.Pirates.full.1369037.jpg",
            "http://wallpapercave.com/wp/BIQIIsL.png",
            "https://myanimelist.cdn-dena.com/images/manga/3/55539.jpg"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered_grid);

        getSupportActionBar().setTitle("One Piece");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        staggeredGridView = (StaggeredGridView)findViewById(R.id.gv_staggered);
        ItemGridAdapter itemGridAdapter = new ItemGridAdapter(StaggeredGridActivity.this, items);
        staggeredGridView.setAdapter(itemGridAdapter);
        staggeredGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DetailImageActivity.toDetailImageActivity(StaggeredGridActivity.this, items[position]);
                }
            });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
            return true;
             }
        return super.onOptionsItemSelected(item);
        }

    public static void toStaggeredGridActivity(Context context){
         context.startActivity(new Intent(context, StaggeredGridActivity.class));
         }
}
