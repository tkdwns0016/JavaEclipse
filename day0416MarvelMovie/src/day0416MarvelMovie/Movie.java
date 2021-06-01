package day0416MarvelMovie;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movie {
	private int id;
	private String genre;
	private String director;
	private String scenario;
	private String title;
	private String producer;
	private String actor;
	private String music;
	private LocalDate begin_filming;
	private LocalDate end_filming;
	private LocalDate release_date;
	private int running_time;
	private int production_cost;
	private long north_america_box_office;
	private long world_box_office;
	private int korean_number_of_audience;
	private String rate;
	private LocalDateTime w_date;
	private LocalDateTime u_date;
	
	
	public static class Builder{
		private int id;
		private String genre;
		private String director;
		private String scenario;
		private String title;
		private String producer;
		private String actor;
		private String music;
		private LocalDate begin_filming;
		private LocalDate end_filming;
		private LocalDate release_date;
		private int running_time;
		private int production_cost;
		private long north_america_box_office;
		private long world_box_office;
		private int korean_number_of_audience;
		private String rate;
		private LocalDateTime w_date;
		private LocalDateTime u_date;


		public Builder setId(int id) {
			this.id = id;
			return this;
		}
		public Builder setGenre(String genre) {
			this.genre = genre;
			return this;
		}

		public Builder setDirector(String director) {
			this.director = director;
			return this;
		}

		public Builder setScenario(String scenario) {
			this.scenario = scenario;
			return this;
		}

		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder setProducer(String producer) {
			this.producer = producer;
			return this;
		}

		public Builder setActor(String actor) {
			this.actor = actor;
			return this;
		}

		public Builder setMusic(String music) {
			this.music = music;
			return this;
		}

		public Builder setBegin_filming(LocalDate begin_filming) {
			this.begin_filming = begin_filming;
			return this;
		}

		public Builder setEnd_filming(LocalDate end_filming) {
			this.end_filming = end_filming;
			return this;
		}

		public Builder setRelease_date(LocalDate release_date) {
			this.release_date = release_date;
			return this;
		}

		public Builder setRunning_time(int running_time) {
			this.running_time = running_time;
			return this;
		}

		public Builder setProduction_cost(int production_cost) {
			this.production_cost = production_cost;
			return this;
		}

		public Builder setNorth_america_box_office(long north_america_box_office) {
			this.north_america_box_office = north_america_box_office;
			return this;
		}

		public Builder setWorld_box_office(long world_box_office) {
			this.world_box_office = world_box_office;
			return this;
		}

		public Builder setKorean_number_of_audience(int korean_number_of_audience) {
			this.korean_number_of_audience = korean_number_of_audience;
			return this;
		}

		public Builder setRate(String rate) {
			this.rate = rate;
			return this;
		}

		public Builder setW_date(LocalDateTime w_date) {
			this.w_date = w_date;
			return this;
		}

		public Builder setU_date(LocalDateTime u_date) {
			this.u_date = u_date;
			return this;
		}
		//Movie 인스턴스를 생성하여 반환하는 메서드
		public Movie build() {
			//Movie에 Builder인스턴스를 매개변수로 넣어 객체를 생성.
			return new Movie(this);
		}
	}
	private Movie(Builder builder) {
		this.id = builder.id;
		this.genre = builder.genre;
		this.director = builder.director;
		this.scenario = builder.scenario;
		this.title = builder.title;
		this.producer = builder.producer;
		this.actor = builder.actor;
		this.music = builder.music;
		this.begin_filming = builder.begin_filming;
		this.end_filming = builder.end_filming;
		this.release_date = builder.release_date;
		this.running_time = builder.running_time;
		this.production_cost = builder.production_cost;
		this.north_america_box_office = builder.north_america_box_office;
		this.world_box_office = builder.world_box_office;
		this.korean_number_of_audience = builder.korean_number_of_audience;
		this.rate = builder.rate;
		this.w_date = builder.w_date;
		this.u_date = builder.u_date;
	}
	
	public int getId() {
		return id;
	}

	public String getGenre() {
		return genre;
	}

	public String getDirector() {
		return director;
	}

	public String getScenario() {
		return scenario;
	}

	public String getTitle() {
		return title;
	}

	public String getProducer() {
		return producer;
	}

	public String getActor() {
		return actor;
	}

	public String getMusic() {
		return music;
	}

	public LocalDate getBegin_filming() {
		return begin_filming;
	}

	public LocalDate getEnd_filming() {
		return end_filming;
	}

	public LocalDate getRelease_date() {
		return release_date;
	}

	public int getRunning_time() {
		return running_time;
	}

	public int getProduction_cost() {
		return production_cost;
	}

	public long getNorth_america_box_office() {
		return north_america_box_office;
	}

	public long getWorld_box_office() {
		return world_box_office;
	}

	public int getKorean_number_of_audience() {
		return korean_number_of_audience;
	}

	public String getRate() {
		return rate;
	}

	public LocalDateTime getW_date() {
		return w_date;
	}

	public LocalDateTime getU_date() {
		return u_date;
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
