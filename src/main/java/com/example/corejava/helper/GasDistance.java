package com.example.corejava.helper;

public class GasDistance {

    public double findMinDistance(int[] stations, int k) {
        double low = 0.0;
        double high = stations[stations.length - 1] - stations[0];

        for (int iter = 0; iter < 100; iter++) {
            double mid = (low + high) / 2.0;
            if (canPlaceStationsInBetween(stations, k, mid)) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return high;
    }

    private boolean canPlaceStationsInBetween(int[] stations, int k, double maxDist) {
        int used = 0;
        for (int i = 0; i < stations.length - 1; i++) {
            double gap = stations[i + 1] - stations[i];
            used += (int)(gap / maxDist);
        }
        return used <= k;
    }
}
