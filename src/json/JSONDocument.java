package json;

public class JSONDocument
{
    public JSONRoot root;

    public JSONDocument(JSONRoot root)
    {
        this.root = root;
    }

    public String toXML()
    {
        String retval = traverseXML(this.root, "");

        return retval;
    }

    public String toJSON()
    {
        String retval = traverseJSON(this.root, "");

        return retval;
    }

    protected String traverseJSON(JSONElement element, String pstring)
    {
        if(element.hasChildren())
        {
            pstring = pstring + " {\"" + element.name + "\":";

            for(int i=0; i<element.children.names.size(); i++)
            {
                pstring = traverseJSON(element.children.values.get(i), pstring);
            }
        }
        else pstring = pstring + " {\"" + element.name + "\"";

        return pstring+"}";
    }

    protected String traverseXML(JSONElement element, String pstring)
    {
        if(element.hasChildren())
        {
            pstring = pstring + " {\"" + element.name + "\":";

            for(int i=0; i<element.children.names.size(); i++)
            {
                pstring = traverseXML(element.children.values.get(i), pstring);
            }
        }
        else pstring = pstring + " {\"" + element.name + "\"";

        return pstring+"}";
    }
}
