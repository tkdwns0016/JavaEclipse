package day0415Ex.MovieEx;

import java.sql.Date;
import java.sql.Timestamp;

public class Movie {
	private int id;
	private String genre;
	private String director;
	private String scenario;
	private String title;
	private String producer;
	private String actor;
	private String music;
	private Date begin_filming;
	private Date end_filming;
	private Date release_date;
	private int running_time;
	private int production_cost;
	private int north_america_box_office;
	private int world_box_office;
	private int korean_number_of_audience;
	private String rate;
	private Timestamp w_date;
	private Timestamp u_date;
	
	public Movie() {}

	public Movie(int id, String genre, String director, String scenario, String title, String producer, String actor,
			String music, Date begin_filming, Date end_filming, Date release_date, int running_time,
			int production_cost, int north_america_box_office, int world_box_office, int korean_number_of_audience,
			String rate, Timestamp w_date, Timestamp u_date) {
		super();
		this.id = id;
		this.genre = genre;
		this.director = director;
		this.scenario = scenario;
		this.title = title;
		this.producer = producer;
		this.actor = actor;
		this.music = music;
		this.begin_filming = begin_filming;
		this.end_filming = end_filming;
		this.release_date = release_date;
		this.running_time = running_time;
		this.production_cost = production_cost;
		this.north_america_box_office = north_america_box_office;
		this.world_box_office = world_box_office;
		this.korean_number_of_audience = korean_number_of_audience;
		this.rate = rate;
		this.w_date = w_date;
		this.u_date = u_date;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public Date getBegin_filming() {
		return begin_filming;
	}

	public void setBegin_filming(Date begin_filming) {
		this.begin_filming = begin_filming;
	}

	public Date getEnd_filming() {
		return end_filming;
	}

	public void setEnd_filming(Date end_filming) {
		this.end_filming = end_filming;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public int getRunning_time() {
		return running_time;
	}

	public void setRunning_time(int running_time) {
		this.running_time = running_time;
	}

	public int getProduction_cost() {
		return production_cost;
	}

	public void setProduction_cost(int production_cost) {
		this.production_cost = production_cost;
	}

	public int getNorth_america_box_office() {
		return north_america_box_office;
	}

	public void setNorth_america_box_office(int north_america_box_office) {
		this.north_america_box_office = north_america_box_office;
	}

	public int getWorld_box_office() {
		return world_box_office;
	}

	public void setWorld_box_office(int world_box_office) {
		this.world_box_office = world_box_office;
	}

	public int getKorean_number_of_audience() {
		return korean_number_of_audience;
	}

	public void setKorean_number_of_audience(int korean_number_of_audience) {
		this.korean_number_of_audience = korean_number_of_audience;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public Timestamp getW_date() {
		return w_date;
	}

	public void setW_date(Timestamp w_date) {
		this.w_date = w_date;
	}

	public Timestamp getU_date() {
		return u_date;
	}

	public void setU_date(Timestamp u_date) {
		this.u_date = u_date;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", genre=" + genre + ", director=" + director + ", scenario=" + scenario + ", title="
				+ title + ", producer=" + producer + ", actor=" + actor + ", music=" + music + ", begin_filming="
				+ begin_filming + ", end_filming=" + end_filming + ", release_date=" + release_date + ", running_time="
				+ running_time + ", production_cost=" + production_cost + ", north_america_box_office="
				+ north_america_box_office + ", world_box_office=" + world_box_office + ", korean_number_of_audience="
				+ korean_number_of_audience + ", rate=" + rate + ", w_date=" + w_date + ", u_date=" + u_date + "]";
	}
	
	

}
