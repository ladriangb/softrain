package com.softrain

/**
 * Departamento
 * A domain class describes the data object and it's mapping to the database
 */
class Departamento {

    /* Default (injected) attributes of GORM */
    //	Long	id
    //	Long	version
	
    
    String nombre
    String detalle
    String webPage
    String ubicacion
    /* Automatic timestamping of GORM */
    //	Date	dateCreated
    //	Date	lastUpdated
	
    //	static	belongsTo	= []	// tells GORM to cascade commands: e.g., delete this object if the "parent" is deleted.
    //	static	hasOne		= []	// tells GORM to associate another domain object as an owner in a 1-1 mapping
    //	static	hasMany		= []	// tells GORM to associate other domain objects for a 1-n or n-m mapping
    //	static	mappedBy	= []	// specifies which property should be used in a mapping 
	
    static	mapping = {
    }
    
    static	constraints = {
        nombre size: 5..15, nullable:false, blank:false
        detalle blank:true,nullable:true
        webPage url:true,blank:true,nullable:true
        ubicacion blank:true,nullable:true
    }
	
    /*
     * Methods of the Domain Class
     */
    //	@Override	// Override toString for a nicer / more descriptive UI 
    //	public String toString() {
    //		return "${name}";
    //	}
}
