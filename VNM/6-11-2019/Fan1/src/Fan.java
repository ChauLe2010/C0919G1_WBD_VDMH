public class Fan {

        public  Fan(){

            }
            private  int Speed = 1;
            private  boolean isOn = false;
            private  int radius = 5;
            String color = "blue";

        public  Fan( int speed, boolean isOn, int radius, String color) {

            Speed = speed;
            this.isOn = isOn;
            this.radius = radius;
            this.color = color;
        }


        public int getSpeed() {
            return Speed;
        }

        public void setSpeed(int speed) {
            Speed = speed;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public String toString(){
            if (this.isOn){
                 return "Fan speed is: " + this.getSpeed() + ", Fan color is: " + this.color + ", Fan radius is: " + this.radius + ", Fan is on";
        }
            else {
                return " Fan color is: " + this.color + ", Fan radius is: " + this.radius + ", Fan is off";
            }
        }
    }



