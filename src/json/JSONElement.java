package json;

import structures.JSONAttrMap;
import structures.JSONElementMap;

public class JSONElement extends JSONObject
{
    public String name = "";

    public JSONNamespace namespace;

    public JSONElementMap children = new JSONElementMap();

    public JSONAttrMap attributes = new JSONAttrMap();

    public JSONElement()
    {
        this.name = "";
    }

    public JSONElement(String name)
    {
        this.name = name;
    }

    public JSONElement getFirstChild()
    {
        return this.children.getFirstChild();
    }

    public JSONElement getLastChild()
    {
        return this.children.getLastChild();
    }

    public void setNamespace(JSONNamespace namespace)
    {
        this.namespace = namespace;
    }

    public void setAttribute(JSONAttribute attr)
    {

    }

    public JSONElement addElement(JSONElement element, JSONAttribute...attrs)
    {
        this.children.names.add(element.name);

        this.children.values.add(element);

        for(JSONAttribute attribute : attrs)
        {
            this.attributes.keys.add(attribute.key);

            this.attributes.values.add(attribute.value);
        }

        return element;
    }

    public JSONElement addElement(JSONElement element)
    {
        this.children.names.add(element.name);

        this.children.values.add(element);

        return element;
    }

    public Boolean hasChildren()
    {
        return this.children.names.size()>0;
    }

    public JSONElementMap getChildren()
    {
        return this.children;
    }

    public JSONNamespace getNamespace()
    {
        return this.namespace;
    }

    public JSONAttrMap getAttributes()
    {
        return this.attributes;
    }
}
