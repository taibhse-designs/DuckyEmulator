package duckyemulator;

import static duckyemulator.DuckyEmulator.box;
import static duckyemulator.DuckyEmulator.list;
import static duckyemulator.DuckyEmulator.read;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author STARK
 */
public class Reader
{
    public static void read() throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(read));
        String line;
        list.removeAll();  //ensure list is empty of any previous script before loading a new one

        //read each line of script into a list
        while ((line = reader.readLine()) != null)
        {
            //System.out.println(line);
            list.add(line);

        }
        box.setText(null); //any text manually typed in gets blanked

        //display each line of script into the text area to allow reading and reviewing
        for (int i = 0; i < list.getItemCount(); i++)
        {
            box.append(i + ":   " + list.getItem(i) + "\n");
        }

        // System.out.println(list.getItemCount());
    }
}
