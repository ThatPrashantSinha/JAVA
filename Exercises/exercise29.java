package Exercises;

public class exercise29 {
    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBuckets) {
        int bucketsNeeded=0;
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;
        }
        bucketsNeeded=(int)Math.round((((width*height)-((double)extraBuckets*areaPerBucket))/areaPerBucket)+0.5);
        return bucketsNeeded;

    }
    public static int getBucketCount(double width, double height,double areaPerBucket) {
        int bucketsNeeded=0;
        if(width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }
        bucketsNeeded=(int)Math.round(((width*height)/areaPerBucket)+0.5);
        return bucketsNeeded;
    }
    public static int getBucketCount(double area,double areaPerBucket) {
        int bucketsNeeded=0;
        if(area<=0||areaPerBucket<=0){
            return -1;
        }
        bucketsNeeded=(int)Math.round((area/areaPerBucket)+0.5);
        return bucketsNeeded;
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(7.25, 4.3, 2.35 ));
    }
}
