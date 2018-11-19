package restaurant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Note {
    
    private String client;
    private Set<Vente> ventes = new LinkedHashSet<>();
    
    public Note(String client) {
        this.client = client;
    }

}
