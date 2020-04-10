package structures;

import json.JSONAttribute;

import java.util.ArrayList;

public class JSONAttributeMap
{
    public ArrayList<String> keys = new ArrayList<>();

    public ArrayList<String> values = new ArrayList<>();

    public int size()
    {
        return keys.size();
    }
}
