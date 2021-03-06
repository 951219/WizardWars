package com.wizard;

import java.util.HashMap;
import java.util.Map;

public class Spells {

    Map<String, Spell> spellList = new HashMap<>();

    public Spells() {
        spellList.put("Lacarnum Inflamarae", new Spell("Lacarnum Inflamarae", 25, 10, 16, 70, 1));
        spellList.put("Lumos Solem", new Spell("Lumos Solem", 45, 17, 23, 65, 2));
        spellList.put("Everte Statum", new Spell("Everte Statum", 45, 23, 29, 60, 3));
        spellList.put("Arania Exumai", new Spell("Arania Exumai ", 50, 30, 36, 55, 4));
        spellList.put("Avada Kedavra", new Spell("Avada Kedavra ", 100, 100, 100, 10, 5));
        spellList.put("Vulnera Sanentur", new Spell("Vulnera Sanentur ", 25, 10, 20, 70, 1));

    }


    public Spell getSpell(String spellName) {
        if (spellList.containsKey(spellName)) {
            return spellList.get(spellName);
        } else {
            System.out.println("This spell does not exsist.");
            return null;
        }


    }

    public Map<String, Spell> getSpellList() {
        return spellList;
    }

    public void setSpellList(Map<String, Spell> spellList) {
        this.spellList = spellList;
    }
}
