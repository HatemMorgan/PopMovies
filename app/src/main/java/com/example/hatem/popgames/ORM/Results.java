
package com.example.hatem.popgames.ORM;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Results {

    @SerializedName("deck")
    @Expose
    private String deck;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("original_release_date")
    @Expose
    private String originalReleaseDate;
    @SerializedName("images")
    @Expose
    private List<Image_> images = new ArrayList<Image_>();
    @SerializedName("videos")
    @Expose
    private List<Video> videos = new ArrayList<Video>();
    @SerializedName("reviews")
    @Expose
    private List<Review> reviews = new ArrayList<Review>();
    @SerializedName("similar_games")
    @Expose
    private List<SimilarGame> similarGames = new ArrayList<SimilarGame>();

    /**
     * 
     * @return
     *     The deck
     */
    public String getDeck() {
        return deck;
    }

    /**
     * 
     * @param deck
     *     The deck
     */
    public void setDeck(String deck) {
        this.deck = deck;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The image
     */
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The originalReleaseDate
     */
    public String getOriginalReleaseDate() {
        return originalReleaseDate;
    }

    /**
     * 
     * @param originalReleaseDate
     *     The original_release_date
     */
    public void setOriginalReleaseDate(String originalReleaseDate) {
        this.originalReleaseDate = originalReleaseDate;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Image_> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image_> images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The videos
     */
    public List<Video> getVideos() {
        return videos;
    }

    /**
     * 
     * @param videos
     *     The videos
     */
    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    /**
     * 
     * @return
     *     The reviews
     */
    public List<Review> getReviews() {
        return reviews;
    }

    /**
     * 
     * @param reviews
     *     The reviews
     */
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    /**
     * 
     * @return
     *     The similarGames
     */
    public List<SimilarGame> getSimilarGames() {
        return similarGames;
    }

    /**
     * 
     * @param similarGames
     *     The similar_games
     */
    public void setSimilarGames(List<SimilarGame> similarGames) {
        this.similarGames = similarGames;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
