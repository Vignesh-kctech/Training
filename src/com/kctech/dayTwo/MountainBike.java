package com.kctech.dayTwo;

	class Bicycle {
	
		public int gear;
		public int speed;
		
		public Bicycle(int gear,int speed) {
			this.gear = gear;
			this.speed = speed;
		}
		
		public void applyBreak(int decrement){
			speed -= decrement;
		}
		
		public void speedUp(int increment) {
			speed += increment;
			
		}
		public String toString() {
			return("no of gears are "+gear
					+"\n"
					+"speed of bicyle"+ speed );
		}
	}
		
		class MountainBike extends Bicycle  
		{ 
		      
		    // the MountainBike subclass adds one more field 
		    public int seatHeight; 
		  
		    // the MountainBike subclass has one constructor 
		    public MountainBike(int gear,int speed, 
		                        int startHeight) 
		    { 
		        // invoking base-class(Bicycle) constructor 
		        super(gear, speed); 
		        seatHeight = startHeight; 
		    }  
		          
		    // the MountainBike subclass adds one more method 
		    public void setHeight(int newValue) 
		    { 
		        seatHeight = newValue; 
		    }  
		      
		    // overriding toString() method 
		    // of Bicycle to print more info 
		    @Override
		    public String toString() 
		    { 
		        return (super.toString()+ 
		                "\nseat height is "+seatHeight); 
		    } 
		     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(3,100,25);
		System.out.println(mb.toString());
		
	}

}
