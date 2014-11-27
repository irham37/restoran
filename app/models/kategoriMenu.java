package models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;
@Entity
public class kategoriMenu extends Model{
	@OneToMany
	public String namakategori;
}
