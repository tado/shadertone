uniform float iOvertoneVolume;

void main(void){
   float x = gl_FragCoord.x;
   float y = gl_FragCoord.y;
   float mov0 = x+y+cos(sin(iGlobalTime)*2.)*100.+sin(x/100.)*1000.;
   float mov1 = y / iResolution.y * iOvertoneVolume * 40.0 + iGlobalTime;
   float mov2 = x / iResolution.x / iOvertoneVolume * 10.0;
   float c1 = abs(sin(mov1+iGlobalTime)/2.+mov2/2.-mov1-mov2+iGlobalTime);
   float c2 = abs(sin(c1+sin(mov0/1000.+iGlobalTime)+sin(y/100.+iGlobalTime)
                      +sin((x+y)/100.)*3.));
   float c3 = abs(sin(c2+cos(mov1+mov2+c2)+cos(mov2)+sin(x/1000.)));
   gl_FragColor = vec4( c1,c2,c3,iOvertoneVolume);
}
