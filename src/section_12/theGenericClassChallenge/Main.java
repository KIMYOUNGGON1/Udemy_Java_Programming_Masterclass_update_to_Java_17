package section_12.theGenericClassChallenge;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Park 인스턴스 생성
        Park grandCanyon = new Park("Grand Canyon National Park", "National Park", new Location(40.1021, -75.4231));

        // River 인스턴스 생성
        List<Location> mississippiRiverLocations = Arrays.asList(
                new Location(47.216, -95.2348),
                new Location(29.1566, -89.2495),
                new Location(35.1556, -90.0659)
        );
        River mississippiRiver = new River("Mississippi River", "River", mississippiRiverLocations);

        // Layer 인스턴스 생성 및 요소 추가
        Layer<Park> parkLayer = new Layer<>(Arrays.asList(grandCanyon));
        Layer<River> riverLayer = new Layer<>(Arrays.asList(mississippiRiver));

        // 레이어 렌더링
        parkLayer.renderLayer();
        riverLayer.renderLayer();
    }
}
