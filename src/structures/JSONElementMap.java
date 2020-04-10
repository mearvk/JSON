package structures;

import json.JSONElement;

import java.util.ArrayList;

public class JSONElementMap
{
    public ArrayList<String> names = new ArrayList<>();

    public ArrayList<JSONElement> values = new ArrayList<>();

    public JSONElement getFirstChild()
    {
        return this.values.get(0);
    }

    public JSONElement getLastChild()
    {
        return this.values.get(this.values.size()-1);
    }
}
