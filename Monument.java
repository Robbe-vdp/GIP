package GeoGuesser3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "monumenten")
public class Monument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "naam")
	private String naam;
	@Column(name = "breedtegraad")
    private double breedtegraad;
	@Column(name = "lengtegraad")
    private double lengtegraad;
	@Column(name = "afbeelding")
    private String afbeelding;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public double getBreedtegraad() {
		return breedtegraad;
	}
	public void setBreedtegraad(double breedtegraad) {
		this.breedtegraad = breedtegraad;
	}
	public double getLengtegraad() {
		return lengtegraad;
	}
	public void setLengtegraad(double lengtegraad) {
		this.lengtegraad = lengtegraad;
	}
	public String getAfbeelding() {
		return afbeelding;
	}
	public void setAfbeelding(String afbeelding) {
		this.afbeelding = afbeelding;
	}
	
}
