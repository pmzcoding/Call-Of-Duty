#::Version 1.0.1;
#::Author TMC, HavMaui;
#::SC_BUILD 4.0.1;
#::EMC Shaders;
new public static SHADER;
new private class selectShader;
declare class "selectshader" as;
new private infiniteSelector;
title "TMC Shader Selecter;load fromclass;'shader.psh'
test;formatLoader {load_FILEFROMMINECRAFT psh.extension}
format_shaderSelection;fromClassSelection "33_shader[_data]";loadData as Dynamic Chunks;selectData mp_map;sp_{usermap}
load selection from public username as '{public_playername;selectLoginData as Name;hide password = t}'
c_shaderHD;requires New Class from mod_optifine{_};else mod_MCPatcher{_};else2 hideHD shaders;
33_shader display TITLE = "Hyperrealistic Shaders";
display DESCRIPTION = "This Shader will show more realistic texture packs VERY smooth lighting, Waving Wheat & More";
if user_selected load shader_hr2
33_shader 
33_shader
33_shader
33_shader
new class "shader_hr2"; 
g_displayDPM 0;g_display newloading Graphics;disallowUID textures;