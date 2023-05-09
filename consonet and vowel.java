import java.util.*;

import javax.swing.plaf.synth.SynthEditorPaneUI;
class Vowel
{
    public static void main(String [] arr)
    {
     char ch='A';
     switch(ch)
     {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        System.out.print("vowel"+ch);
        break;
        default:
        System.out.print("Consone"+ch);
        break;
    
     }
    }
}