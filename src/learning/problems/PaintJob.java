package learning.problems;

public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}
		double areaToPaint = width * height;
		double areaWeCanPaint = areaPerBucket * extraBuckets;
		double areaLeftToPaint = areaToPaint - areaWeCanPaint;

		return (int) Math.ceil(areaLeftToPaint / areaPerBucket);
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0.0) {
			return -1;
		}
		double areaToPaint = width * height;
		return ((int) Math.ceil(areaToPaint / areaPerBucket));
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		if (area <= 0 || areaPerBucket <= 0.0) {
			return -1;
		}
		return ((int) Math.ceil(area / areaPerBucket));
	}

}
