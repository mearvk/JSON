package json;

import structures.JSONAttrMap;

public class JSONRoot extends JSONElement
{
    public JSONRoot() throws Exception
    {
        return;
    }

    public JSONRoot(String name) throws Exception
    {
        this.name  = name;
    }

    public JSONRoot(String name, JSONNamespace namespace, JSONAttribute...attributes) throws Exception
    {
        this.name = name;

        this.namespace = namespace;

        for(JSONAttribute attribute: attributes)
        {
            this.attributes.keys.add(attribute.key);

            this.attributes.values.add(attribute.value);
        }
    }


}