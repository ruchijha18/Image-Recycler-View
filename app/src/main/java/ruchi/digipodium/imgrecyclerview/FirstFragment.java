package ruchi.digipodium.imgrecyclerview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import ruchi.digipodium.imgrecyclerview.models.GoodBook;

public class FirstFragment extends Fragment {
    List<GoodBook> goodBooks;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        goodBooks=new ArrayList<>();
        goodBooks.add(new GoodBook("Turtles All The way Down", "John Green’s book Turtles All The Way Down uses high school romance, friendship, loss and mystery as the backdrop to a story that takes a look into the brain of a 16-year-old girl suffering from obsessive compulsive disorder.", "https://readinglist.click/wp-content/uploads/2017/09/turtles-all-the-way-down.jpg"));
        goodBooks.add(new GoodBook("Death on the Nile", "Agatha Christie’s detective novel featuring Hercule Poirot is set primarily in Egypt on a boat going down the Nile. Several murders are committed and Poirot, the well-known Belgian detective, is called upon to solve them. The novel begins in England, however, with an apparent love triangle between two young women who are old friends and a young man who is engaged to one of them. Jacqueline de Bellefort, who is engaged to Simon Doyle, goes to visit Linnet Ridgeway to ask her to give Simon a job. ","https://kbimages1-a.akamaihd.net/3f075b86-2eb4-4f3d-bfad-08df6707f1e4/353/569/90/False/death-on-the-nile.jpg"));
        goodBooks.add(new GoodBook("Sita Warrior of Mithila", "While the essential story would be familiar to most Indians, I am very pleased to say that Amish gives us a Sita far removed from the demure, duty-bound creature of numerous syrupy text and screen versions, far removed it has to be said from Valmiki's original story which depicted both Ram and Sita in far more nuanced and human fashion.", "https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Sita_Warrior_of_Mithila_cover.jpg/220px-Sita_Warrior_of_Mithila_cover.jpg"));
        goodBooks.add(new GoodBook("God Is A Gamer","What happens when you cross gamer, banker, politician and terrorist with virtual money? God Is a Gamer is a world where money means nothing, martyrs are villains, predators are prey, assassination is taught by the ancient Greeks and nothing is as it seems. Totally unputdownable, it is Ravi Subramanian's best novel yet.", "https://m.media-amazon.com/images/I/51s5gW+c0qL.jpg"));
        goodBooks.add(new GoodBook("Harry Potter", "Adaptation of the first of J.K. Rowling's popular children's novels about Harry Potter, a boy who learns on his eleventh birthday that he is the orphaned son of two powerful wizards and possesses unique magical powers of his own. He is summoned from his life as an unwanted child to become a student at Hogwarts, an English boarding school for wizards. There, he meets several friends who become his closest allies and help him discover the truth about his parents' mysterious deaths.", "https://cdn.lifehack.org/wp-content/uploads/2015/03/harry_potter_and_the_Sorcerers_stone_adult_usa.jpg"));
        goodBooks.add(new GoodBook("Little Women","Little Women follows the lives of the four March sisters, who live in genteel poverty in the nineteenth century United States. Each of the sisters seeks out a different form of happiness: Meg wants to marry, Jo wants to be a writer, Beth wants to care for her family, and Amy craves material success.","https://assets.americanliterature.com/al/images/book/little-women-cover-small.jpg"));
        goodBooks.add(new GoodBook("Romeo And Juliet","Romeo and Juliet is a play written by Shakespeare. It is a tragic love story where the two main characters, Romeo and Juliet, are supposed to be sworn enemies but fall in love. ... Romeo goes to celebrate his marriage with his friends, Mercutio and Benvolio, but gets into a fight with Juliet's cousin, Tybalt.", "https://cdn.lifehack.org/wp-content/uploads/2015/03/cvr9781451621709_9781451621709_hr.jpg"));
        goodBooks.add(new GoodBook("The Hobbit","The Hobbit is set within Tolkien's fictional universe and follows the quest of home-loving Bilbo Baggins, the titular hobbit, to win a share of the treasure guarded by Smaug the dragon. Bilbo's journey takes him from light-hearted, rural surroundings into more sinister territory.","https://cdn.lifehack.org/wp-content/uploads/2015/03/Hobbit_book.jpg"));
        goodBooks.add(new GoodBook("The Kite Runner", "The story is narrated from the year 2002. Amir, who is thus far a nameless protagonist, tells us that an event in the winter of 1975 changed his life forever. We do not know anything about this event except that it still haunts him and that it involves something he did to Hassan, whom he calls, the harelipped kite runner.", "https://cdn.lifehack.org/wp-content/uploads/2015/03/kiterunner.jpg"));
        goodBooks.add(new GoodBook("Of Mice And Men", "Of Mice and Men is a novella written by John Steinbeck. Published in 1937, it tells the story of George Milton and Lennie Small, two displaced migrant ranch workers, who move from place to place in California in search of new job opportunities during the Great Depression in the United States.", "https://cdn.lifehack.org/wp-content/uploads/2015/03/bookcover2.jpg"));
        goodBooks.add(new GoodBook("The Long Walk", "The Long Walk is a annual contest between 100 male teenagers from all over the United States and the walk starts in Maine and ends whenever the last \"Walker\" is left standing, well more or less walking. It is a test to see each states physical, mental, and emotional stability in young teens. The walkers must keep a constant speed of 4 Mph or more, but if they go slower than 4 Mph, the walkers will get \"ticketed.\" Ticketed meaning as they will get 3 verbal warnings, then will get shot by the soldiers following along side the walkers on a half-track. The book revolves around the conflicts and dialogue of 6 teenagers with different back-stories and different histories. The main character, Raymond Garraty, is a young 16-year old boy from Pownal of Andrscoggin County, Maine. He is followed along side by Peter McVries, Hank Olson, Arthur Baker, a young male named Barkovitch, Collie Parker and many more.", "https://m.media-amazon.com/images/I/51AMnRHUM1L.jpg"));
        goodBooks.add(new GoodBook("All About LOve", "e're taught to think of love as something that happens to us. It's a magical but altogether passive experience. In her deeply personal and emphatic All About Love, renowned social activist and feminist bell hooks asserts that, in fact, love is a choice we must all make and it's not nearly as abstract or elusive as many of us have come to believe. The book not only explores the role of love in our lives and the ways our culture has distorted its meaning, but guides us — with clear definitions and examples — toward a better understanding of how to cultivate it. If you've ever wondered why some relationships stand the test of time while others crumble, you should read this book.", "https://www.powells.com/portals/0/images/9780060959470.jpg"));

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView goodbookList=view.findViewById(R.id.goodbookList);
        goodbookList.setLayoutManager(new GridLayoutManager(getActivity(),2));
        GoodBookAdapter adapter= new GoodBookAdapter(getActivity(), R.layout.card_good_book, goodBooks);
        goodbookList.setAdapter(adapter);

    }
    class GoodBookAdapter extends RecyclerView.Adapter<GoodBookAdapter.Holder>{

        private final Context c;
        private final int layout;
        private final List<GoodBook> books;
        private final LayoutInflater inflater;

        public GoodBookAdapter(Context c, int layout, List<GoodBook> books) {
            this.c = c;
            this.layout = layout;
            this.books = books;
            inflater = LayoutInflater.from(c);

        }

        @NonNull
        @Override
        public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v=inflater.inflate(layout, parent, false);

            return new Holder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull Holder holder, int position) {
            GoodBook book =books.get(position);
            holder.title.setText(book.title);
            Glide.with(c).load(book.imageUrl).into(holder.image);
            holder.card.setTag(book);
        }

        @Override
        public int getItemCount() {

            return books.size();
        }

        class Holder extends RecyclerView.ViewHolder{
            CardView card;
            TextView title;
            ImageView image;


            public Holder(@NonNull View v) {
                super(v);
                card=v.findViewById(R.id.card);
                title=v.findViewById(R.id.title);
                image=v.findViewById(R.id.image);
                card.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        GoodBook book=(GoodBook) v.getTag();
                        FirstFragmentDirections.ActionFirstFragmentToSecondFragment action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
                        action.setTitle(book.title);
                        action.setDescription(book.description);
                        action.setImage(book.imageUrl);
                        Navigation.findNavController(v).navigate(action);

                        //todo load next frag with details from first frag
                    }
                });

            }
        }

    }
}