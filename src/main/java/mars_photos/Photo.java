package mars_photos;


public class Photo {

    private long id;
    private long sol;
    private RoverCamera roverCamera;
    private String imgSrc;
    private String earthDate;
    private Rover rover;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSol() {
        return sol;
    }

    public void setSol(long sol) {
        this.sol = sol;
    }

    public RoverCamera getRoverCamera() {
        return roverCamera;
    }

    public void setRoverCamera(RoverCamera roverCamera) {
        this.roverCamera = roverCamera;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getEarthDate() {
        return earthDate;
    }

    public void setEarthDate(String earthDate) {
        this.earthDate = earthDate;
    }

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

}