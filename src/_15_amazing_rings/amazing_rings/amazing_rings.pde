void draw(){
for(int i = 14; i > 0; i--){
if (i % 2 == 0){
fill(#000000);
}else{
noFill();
}
ellipse(125,250,i * 10, i * 10);
ellipse(375,250,i * 10, i * 10);
}




}
void setup(){
size(500,500);







}
