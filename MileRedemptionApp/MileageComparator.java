import java.util.Comparator;

public class MileageComparator implements Comparator<Destination>
{
 @Override
 public int compare(Destination d1, Destination d2)
 {
 return (d2.getNormalMiles() - d1.getNormalMiles());
 }
 
} 