import processing.core.PApplet;

public class Sketch extends PApplet {

  //variables that are used to complete the tutorial
  int Cell_Width = 20;
  int Cell_Height = 20;
  int Margin = 5;
  int Row_Count = 10;
  int Column_Count = 10;
  int Screen_Width;
  int Screen_Height;
  int intRow;
  int intColumn;
  
  //variables reponsible for selecting the cells and colouring
  int[][] intGrid = new int [Row_Count][Column_Count];
  int chosenCells = 0;
  int chosenRow = 0;
  int chosenColumn = 0;
  int rowNumber = 0;
  int columnNum = 0;
  int maxNum = 0;
  int greenCount = 0;
	
  public void settings() {

    // calculating the size of the screen
    Screen_Width = (Cell_Width + Margin) * Column_Count + Margin;
    Screen_Height = (Cell_Height + Margin) * Row_Count + Margin;
    
    //size displayed on the viewer's screen
    size(Screen_Width, Screen_Height);
  }

  public void setup() {

    background(0, 0, 0);
  }
 
  public void draw() {

   //the loop is used to figure out the colour of a cell using cell height, cell width, and margin
   for(intRow = 0; intRow < Row_Count; intRow++) {
     for(intColumn = 0; intColumn < Column_Count; intColumn++) {
       if (intGrid[intColumn][intRow] == 1) {
         noStroke();
         fill(65, 232, 68);
         rect(intRow * (Cell_Height + Margin) + Margin, intColumn * (Cell_Height + Margin) + Margin, Cell_Width, Cell_Height);
        }
       else {
         noStroke();
         fill(255, 255, 255);
         rect(intRow * (Cell_Height + Margin) + Margin, intColumn * (Cell_Height + Margin) + Margin, Cell_Width, Cell_Height);
        }
      }
    }
  }

  public void mousePressed(){
    for(intRow = 0; intRow < Row_Count; intRow++) {
      for(intColumn = 0; intColumn < Column_Count; intColumn++) {

        //this tells user the mouse and grid coordinates of the mouse when clicked
        if(mouseX > intColumn * (Cell_Height + Margin) + Margin && mouseX < intColumn * (Cell_Height + Margin) + Margin + Cell_Height && mouseY > intRow * (Cell_Width + Margin) + Margin && mouseY < intRow * (Cell_Width + Margin) + Cell_Width + Margin) {
          System.out.println(" ");
          System.out.println("mouse coordinates: (" + mouseX + ", " + mouseY + ") ; grid coordinates: (row:" + intRow + ", column: " + intColumn + ")");
        
        
          //determines whether the clicked block turns green and determines if the left, right, top, and down of the clicked block will be green
         if(intRow == 0 && intColumn == 0 ) {
             
            //when the mouse clicks the top left corner
            if(intGrid[intRow][intColumn] == 0) {
              intGrid[intRow][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn] == 1) {
              intGrid[intRow][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn + 1] == 0) {
              intGrid[intRow][intColumn + 1]  = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn + 1]  == 1) {
              intGrid[intRow][intColumn + 1]  = 0;
              chosenCells--;
            }
           
            if(intGrid[intRow + 1][intColumn] == 0) {
              intGrid[intRow + 1][intColumn]  = 1;
              chosenCells++;
            }
            else if ( intGrid[intRow + 1][intColumn] == 1) {
              intGrid[intRow + 1][intColumn] = 0;
              chosenCells--;
            }
          }

          //when the mouse clicks the top right corner
          else if(intRow == 0 && intColumn == (Column_Count - 1)) {

            if(intGrid[intRow][intColumn] == 0) {
              intGrid[intRow][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn] == 1) {
              intGrid[intRow][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn - 1] == 0) {
              intGrid[intRow][intColumn - 1]  = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn - 1]  == 1) {
              intGrid[intRow][intColumn - 1]  = 0;
              chosenCells--;
            }
           
            if(intGrid[intRow + 1][intColumn] == 0) {
              intGrid[intRow + 1][intColumn]  = 1;
              chosenCells++;
            }
            else if ( intGrid[intRow + 1][intColumn] == 1) {
              intGrid[intRow + 1][intColumn] = 0;
              chosenCells--;
            }
          }

          //when the mouse clicks the bottom left corner
          else if(intRow == 9 && intColumn == 0) {
            if(intGrid[intRow][intColumn] == 0) {
              intGrid[intRow][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn] == 1) {
              intGrid[intRow][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn + 1] == 0) {
              intGrid[intRow][intColumn + 1]  = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn + 1]  == 1) {
              intGrid[intRow][intColumn + 1]  = 0;
              chosenCells--;
            }
           
            if(intGrid[intRow - 1][intColumn] == 0) {
              intGrid[intRow - 1][intColumn]  = 1;
              chosenCells++;
            }
            else if ( intGrid[intRow - 1][intColumn] == 1) {
              intGrid[intRow - 1][intColumn] = 0;
              chosenCells--;
            } 
          }

          //when the mouse clicks the bottom right corner
          else if(intRow == 9 && intColumn == 9) {
            if(intGrid[intRow][intColumn] == 0) {
              intGrid[intRow][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn] == 1) {
              intGrid[intRow][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn - 1] == 0) {
              intGrid[intRow][intColumn - 1]  = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn - 1]  == 1) {
              intGrid[intRow][intColumn - 1]  = 0;
              chosenCells--;
            }
           
            if(intGrid[intRow - 1][intColumn] == 0) {
              intGrid[intRow - 1][intColumn]  = 1;
              chosenCells++;
            }
            else if ( intGrid[intRow - 1][intColumn] == 1) {
              intGrid[intRow - 1][intColumn] = 0;
              chosenCells--;
            }
          }

          //When the mouse clicks the top edge
          else if(intRow == 0) {
            if(intGrid[intRow][intColumn] == 0) {
              intGrid[intRow][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn] == 1) {
              intGrid[intRow][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn + 1] == 0) {
              intGrid[intRow][intColumn + 1] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn + 1] == 1) {
              intGrid[intRow][intColumn + 1] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn - 1] == 0) {
              intGrid[intRow][intColumn - 1] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn - 1] == 1) {
              intGrid[intRow][intColumn - 1] = 0;
              chosenCells--;
            }

            if(intGrid[intRow + 1][intColumn] == 0) {
              intGrid[intRow + 1][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow + 1][intColumn] == 1) {
              intGrid[intRow + 1][intColumn] = 0;
              chosenCells--;
            }
          }

          //When the mouse clicks the bottom edge
          else if( intRow == 9) {
            if(intGrid[intRow][intColumn] == 0) {
              intGrid[intRow][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn] == 1) {
              intGrid[intRow][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn + 1] == 0) {
              intGrid[intRow][intColumn + 1] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn + 1] == 1) {
              intGrid[intRow][intColumn + 1] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn - 1] == 0) {
              intGrid[intRow][intColumn - 1] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn - 1] == 1) {
              intGrid[intRow][intColumn - 1] = 0;
              chosenCells--;
            }

            if(intGrid[intRow - 1][intColumn] == 0) {
              intGrid[intRow - 1][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow - 1][intColumn] == 1) {
              intGrid[intRow - 1][intColumn] = 0;
              chosenCells--;
            }
          }

          //When the mouse clicks the right edge
          else if(intColumn == 9) {
            if(intGrid[intRow][intColumn] == 0) {
              intGrid[intRow][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn] == 1) {
              intGrid[intRow][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn - 1] == 0) {
              intGrid[intRow][intColumn - 1] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn - 1] == 1) {
              intGrid[intRow][intColumn - 1] = 0;
              chosenCells--;
            }

            if(intGrid[intRow + 1][intColumn] == 0) {
              intGrid[intRow + 1][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow + 1][intColumn] == 1) {
              intGrid[intRow + 1][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow - 1][intColumn] == 0) {
              intGrid[intRow - 1][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow - 1][intColumn] == 1) {
              intGrid[intRow - 1][intColumn] = 0;
              chosenCells--;
            }
          }

          //When the mouse clicks the left edge
          else if(intColumn == 0) {
            if(intGrid[intRow][intColumn] == 0) {
              intGrid[intRow][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn] == 1) {
              intGrid[intRow][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn + 1] == 0) {
              intGrid[intRow][intColumn + 1] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn + 1] == 1) {
              intGrid[intRow][intColumn + 1] = 0;
              chosenCells--;
            }

            if(intGrid[intRow + 1][intColumn] == 0) {
              intGrid[intRow + 1][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow + 1][intColumn] == 1) {
              intGrid[intRow + 1][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow - 1][intColumn] == 0) {
              intGrid[intRow - 1][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow - 1][intColumn] == 1) {
              intGrid[intRow - 1][intColumn] = 0;
              chosenCells--;
            }
          }

          //when the mouse clicks inside without touching any edges
          else {
            if(intGrid[intRow][intColumn] == 0) {
              intGrid[intRow][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn] == 1) {
              intGrid[intRow][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn - 1] == 0) {
              intGrid[intRow][intColumn - 1] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn - 1] == 1) {
              intGrid[intRow][intColumn - 1] = 0;
              chosenCells--;
            }

            if(intGrid[intRow][intColumn + 1] == 0) {
              intGrid[intRow][intColumn + 1] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow][intColumn + 1] == 1) {
              intGrid[intRow][intColumn + 1] = 0;
              chosenCells--;
            }

            if(intGrid[intRow + 1][intColumn] == 0) {
              intGrid[intRow + 1][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow + 1][intColumn] == 1) {
              intGrid[intRow + 1][intColumn] = 0;
              chosenCells--;
            }

            if(intGrid[intRow - 1][intColumn] == 0) {
              intGrid[intRow - 1][intColumn] = 1;
              chosenCells++;
            }
            else if (intGrid[intRow - 1][intColumn] == 1) {
              intGrid[intRow - 1][intColumn] = 0;
              chosenCells--;
            }
            
          }
          
          //display the cell imformation to the user everytime they click
          System.out.println("Total of " + chosenCells + " cells are selected.");
        } 
      } 
    }     

    //diplays continous cells in rows and calculates how many green cells in each row
    for(intRow = 0; intRow < Row_Count; intRow++) {
      for(intColumn = 0; intColumn < Column_Count; intColumn++) {
        if(intGrid[intRow][intColumn] == 1) {
          rowNumber++; 
        }

        if(intColumn > 0 && intColumn < 9){
          
          if(intGrid[intRow][intColumn] == 1 && intGrid[intRow][intColumn + 1] == 1) {
            greenCount++;
          }
 
          if(intGrid[intRow][intColumn] == 1 && intGrid[intRow][intColumn - 1] == 1 && intColumn == 9) {
            greenCount++;
          }

          if(intGrid[intRow][intColumn] == 1 && intGrid[intRow][intColumn - 1] == 1 && intGrid[intRow][intColumn + 1] == 1 && intColumn < 9){
           greenCount++;
          }
        }
      }

      //output
      System.out.println("Row " + intRow + " has " + rowNumber + " cells selected");
      rowNumber = 0;
      if(greenCount > 2 && intRow > 0) {
        System.out.println("There are " + greenCount + " continous blocks selected on row " + intRow + ".");
        greenCount = 0;
      }
    }

    //displays how many cells are green in each column
    for(intColumn = 0; intColumn < Column_Count; intColumn++) {
      for (intRow = 0; intRow < Row_Count; intRow++) {
        if(intGrid[intRow][intColumn] == 1) {
         columnNum++;
        }
      }

      //output
      System.out.println("Column " + intColumn + " has " + columnNum + " cells selected.");
     columnNum = 0;
    }
  }
}