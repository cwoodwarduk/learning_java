package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double area = width * height;

        return ((int) Math.ceil(area / areaPerBucket)) - extraBuckets;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double area = width * height;

        int bucketsRequired = 0;

        while ((bucketsRequired * areaPerBucket) < area){
            bucketsRequired++;
        }

        return bucketsRequired;
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        int bucketsRequired = 0;

        while ((bucketsRequired * areaPerBucket) < area){
            bucketsRequired++;
        }

        return bucketsRequired;
    }
}
