package main;

import json.test.JSONHarness;

public class Main
{
    public static void main(String...args)
    {
        try
        {
            JSONHarness harness = new JSONHarness();

            //

            new JSONHarness.Test001();

            new JSONHarness.Test002();

            //new JSONHarness.Test003();

            //new JSONHarness.Test004();

            //new JSONHarness.Test005();

            //new JSONHarness.Test006();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
