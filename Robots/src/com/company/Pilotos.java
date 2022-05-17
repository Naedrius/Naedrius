package com.company;


public class Pilotos {
    private String alias; //Not Blank, Not Empty, Length>3 & always UPPERCASE

    public Pilotos(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        assert  !alias.isBlank();
        assert  !alias.isEmpty();
        assert alias.length()>3;
        this.alias = alias.toUpperCase();
    }

    @Override
    public String toString() {
        return alias;
    }
}
