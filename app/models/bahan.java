package models;
import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity
public class bahan extends Model {
	
	public String satuan;
	public String namaBahan ;
	public int jumlah ;
	public Date date ;
	
}
