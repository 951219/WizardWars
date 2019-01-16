package com.wizard;
// validate name and surname

public class CharacterCreaton {

    public boolean validateFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {//string can be empty, null on et ei exsisti., null peab olema eespool kuna kui mingi teine dev kasutaab ja saadab stringi väärtuseta siis see ei crashi. string on null siis ei saa selle methodeid kasutada
            System.out.println("Name is not suitable. You did not enter any name");
            return false;
        }
        if (firstName.contains(" ")){
            System.out.println("First name must not contain any space");
            return false;
        }


        String filteredName = eraseNonLetters(firstName);
        if(!firstName.equalsIgnoreCase(filteredName)){
            System.out.println("First name is not suitable, No numbers/Punctuations");
            return false;
        }

        return true;
    }




    public boolean validateLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {//string can be empty, null on et ei exsisti., null peab olema eespool kuna kui mingi teine dev kasutaab ja saadab stringi väärtuseta siis see ei crashi. string on null siis ei saa selle methodeid kasutada
            System.out.println("Name is not suitable. You did not enter any name");
            return false;
        }

        String filteredName = eraseNonLetters(lastName);
        if(!lastName.equalsIgnoreCase(filteredName)){
            System.out.println("First name is not suitable, No numbers/Punctuations");
            return false;
        }

        return true;
    }

    private String eraseNonLetters(String word){
        String result = word.replaceAll("\\d", "");
        result = result.replaceAll("\\p{Punct}", "");
        return result;
    }




}
