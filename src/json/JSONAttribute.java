package json;

public class JSONAttribute extends JSONObject
{
    public String key, value;

    public Integer ikey, ivalue;

    public JSONAttribute(String key)
    {
        this.key = key;

        this.value = "";
    }

    public JSONAttribute(String key, String value)
    {
        this.key = key;

        this.value = value;
    }

    public JSONAttribute(String key, Integer value)
    {
        this.key = key;

        this.ivalue = value;
    }
}
