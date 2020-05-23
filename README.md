# retail-store-discount
Retail Store Discount Service

This project calculates the net amount for a given bill. Once the app starts 4 users get created as initial data, user's information below:<br/>
  ID    firstName   LastName    CreationDate    UserType<br/>
  1     Yasser      Shadid      startup time    customer<br/>
  2     Jack        Nicklson    startup time    customer<br/>
  3     John        Doe         startup time    affiliate<br/>
  4     Reem        Abdullah    startup time    employee <br/>

I used h2 in memory database for the sake of demo, please consider that the data will not be available if the application is not running. 

### Class Diagram
%3CmxGraphModel%3E%3Croot%3E%3CmxCell%20id%3D%220%22%2F%3E%3CmxCell%20id%3D%221%22%20parent%3D%220%22%2F%3E%3CmxCell%20id%3D%222%22%20style%3D%22edgeStyle%3DorthogonalEdgeStyle%3Brounded%3D0%3BorthogonalLoop%3D1%3BjettySize%3Dauto%3Bhtml%3D1%3BexitX%3D1%3BexitY%3D1%3BexitDx%3D0%3BexitDy%3D0%3B%22%20edge%3D%221%22%20source%3D%226%22%20parent%3D%221%22%3E%3CmxGeometry%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22450%22%20y%3D%22140%22%20as%3D%22targetPoint%22%2F%3E%3CArray%20as%3D%22points%22%3E%3CmxPoint%20x%3D%22330%22%20y%3D%22140%22%2F%3E%3C%2FArray%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%223%22%20value%3D%22%26lt%3Bpre%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3B%26lt%3Bpre%20style%3D%26quot%3Bfont-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BCrudRepository%26lt%3B%2Fpre%26gt%3B%26lt%3B%2Fpre%26gt%3B%22%20style%3D%22swimlane%3Bhtml%3D1%3BfontStyle%3D1%3Balign%3Dcenter%3BverticalAlign%3Dtop%3BchildLayout%3DstackLayout%3Bhorizontal%3D1%3BstartSize%3D40%3BhorizontalStack%3D0%3BresizeParent%3D1%3BresizeLast%3D0%3Bcollapsible%3D1%3BmarginBottom%3D0%3BswimlaneFillColor%3D%23ffffff%3Brounded%3D0%3Bshadow%3D0%3Bcomic%3D0%3BlabelBackgroundColor%3Dnone%3BstrokeWidth%3D1%3BfillColor%3Dnone%3BfontFamily%3DVerdana%3BfontSize%3D12%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22760%22%20y%3D%2220%22%20width%3D%22240%22%20height%3D%22161.5%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%224%22%20value%3D%22%22%20style%3D%22line%3Bhtml%3D1%3BstrokeWidth%3D1%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dmiddle%3BspacingTop%3D-1%3BspacingLeft%3D3%3BspacingRight%3D3%3Brotatable%3D0%3BlabelPosition%3Dright%3Bpoints%3D%5B%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%223%22%3E%3CmxGeometry%20y%3D%2240%22%20width%3D%22240%22%20height%3D%228%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%225%22%20value%3D%22%26lt%3Bspan%26gt%3B%26lt%3Bbr%26gt%3B%26lt%3B%2Fspan%26gt%3B%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%223%22%3E%3CmxGeometry%20y%3D%2248%22%20width%3D%22240%22%20height%3D%224%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%226%22%20value%3D%22%26lt%3Bpre%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3B%26lt%3Bpre%20style%3D%26quot%3Bfont-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BBillCalculatorApi%26lt%3B%2Fpre%26gt%3B%26lt%3B%2Fpre%26gt%3B%22%20style%3D%22swimlane%3Bhtml%3D1%3BfontStyle%3D1%3Balign%3Dcenter%3BverticalAlign%3Dtop%3BchildLayout%3DstackLayout%3Bhorizontal%3D1%3BstartSize%3D40%3BhorizontalStack%3D0%3BresizeParent%3D1%3BresizeLast%3D0%3Bcollapsible%3D1%3BmarginBottom%3D0%3BswimlaneFillColor%3D%23ffffff%3Brounded%3D0%3Bshadow%3D0%3Bcomic%3D0%3BlabelBackgroundColor%3Dnone%3BstrokeWidth%3D1%3BfillColor%3Dnone%3BfontFamily%3DVerdana%3BfontSize%3D12%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%2290%22%20y%3D%2250%22%20width%3D%22240%22%20height%3D%22161.5%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%227%22%20value%3D%22%22%20style%3D%22line%3Bhtml%3D1%3BstrokeWidth%3D1%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dmiddle%3BspacingTop%3D-1%3BspacingLeft%3D3%3BspacingRight%3D3%3Brotatable%3D0%3BlabelPosition%3Dright%3Bpoints%3D%5B%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%226%22%3E%3CmxGeometry%20y%3D%2240%22%20width%3D%22240%22%20height%3D%228%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%228%22%20value%3D%22%2B%26amp%3Bnbsp%3B%26lt%3Bspan%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BcalculateNetPayable%26lt%3B%2Fspan%26gt%3B%26lt%3Bspan%26gt%3B%3A%20respone%26lt%3Bbr%26gt%3B%26lt%3Bbr%26gt%3B%26lt%3B%2Fspan%26gt%3B%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%226%22%3E%3CmxGeometry%20y%3D%2248%22%20width%3D%22240%22%20height%3D%2226%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%229%22%20value%3D%22%2B%20method(type)%3A%20type%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%226%22%3E%3CmxGeometry%20y%3D%2274%22%20width%3D%22240%22%20height%3D%2230%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2210%22%20value%3D%22%26lt%3Bpre%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3B%26lt%3Bpre%20style%3D%26quot%3Bfont-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BBillCalculatorService%26lt%3B%2Fpre%26gt%3B%26lt%3B%2Fpre%26gt%3B%22%20style%3D%22swimlane%3Bhtml%3D1%3BfontStyle%3D1%3Balign%3Dcenter%3BverticalAlign%3Dtop%3BchildLayout%3DstackLayout%3Bhorizontal%3D1%3BstartSize%3D40%3BhorizontalStack%3D0%3BresizeParent%3D1%3BresizeLast%3D0%3Bcollapsible%3D1%3BmarginBottom%3D0%3BswimlaneFillColor%3D%23ffffff%3Brounded%3D0%3Bshadow%3D0%3Bcomic%3D0%3BlabelBackgroundColor%3Dnone%3BstrokeWidth%3D1%3BfillColor%3Dnone%3BfontFamily%3DVerdana%3BfontSize%3D12%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22450%22%20y%3D%2250%22%20width%3D%22240%22%20height%3D%22161.5%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2211%22%20value%3D%22%22%20style%3D%22line%3Bhtml%3D1%3BstrokeWidth%3D1%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dmiddle%3BspacingTop%3D-1%3BspacingLeft%3D3%3BspacingRight%3D3%3Brotatable%3D0%3BlabelPosition%3Dright%3Bpoints%3D%5B%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2210%22%3E%3CmxGeometry%20y%3D%2240%22%20width%3D%22240%22%20height%3D%228%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2212%22%20value%3D%22%2B%26amp%3Bnbsp%3B%26lt%3Bspan%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BcalculateNetPayable%26lt%3B%2Fspan%26gt%3B%26lt%3Bspan%26gt%3B%3A%20BillInfo%26lt%3Bbr%26gt%3B%26lt%3Bbr%26gt%3B%26lt%3B%2Fspan%26gt%3B%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2210%22%3E%3CmxGeometry%20y%3D%2248%22%20width%3D%22240%22%20height%3D%2226%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2213%22%20value%3D%22%2B%20getUser(userId)%3A%20User%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2210%22%3E%3CmxGeometry%20y%3D%2274%22%20width%3D%22240%22%20height%3D%2226%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2214%22%20value%3D%22%2B%20getUserType(user)%3A%20UserType%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2210%22%3E%3CmxGeometry%20y%3D%22100%22%20width%3D%22240%22%20height%3D%2230%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2215%22%20style%3D%22edgeStyle%3DorthogonalEdgeStyle%3Bhtml%3D1%3BlabelBackgroundColor%3Dnone%3BstartFill%3D0%3BstartSize%3D8%3BendArrow%3Dblock%3BendFill%3D0%3BendSize%3D16%3BfontFamily%3DVerdana%3BfontSize%3D12%3B%22%20edge%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22880%22%20y%3D%22221.5%22%20as%3D%22sourcePoint%22%2F%3E%3CmxPoint%20x%3D%22880%22%20y%3D%22180.5%22%20as%3D%22targetPoint%22%2F%3E%3CArray%20as%3D%22points%22%3E%3CmxPoint%20x%3D%22880%22%20y%3D%22320.5%22%2F%3E%3C%2FArray%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2216%22%20value%3D%22%26lt%3Bpre%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3B%26lt%3Bpre%20style%3D%26quot%3Bfont-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BUserRepository%26lt%3B%2Fpre%26gt%3B%26lt%3B%2Fpre%26gt%3B%22%20style%3D%22swimlane%3Bhtml%3D1%3BfontStyle%3D1%3Balign%3Dcenter%3BverticalAlign%3Dtop%3BchildLayout%3DstackLayout%3Bhorizontal%3D1%3BstartSize%3D40%3BhorizontalStack%3D0%3BresizeParent%3D1%3BresizeLast%3D0%3Bcollapsible%3D1%3BmarginBottom%3D0%3BswimlaneFillColor%3D%23ffffff%3Brounded%3D0%3Bshadow%3D0%3Bcomic%3D0%3BlabelBackgroundColor%3Dnone%3BstrokeWidth%3D1%3BfillColor%3Dnone%3BfontFamily%3DVerdana%3BfontSize%3D12%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22770%22%20y%3D%22320.5%22%20width%3D%22240%22%20height%3D%22161.5%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2217%22%20value%3D%22%22%20style%3D%22line%3Bhtml%3D1%3BstrokeWidth%3D1%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dmiddle%3BspacingTop%3D-1%3BspacingLeft%3D3%3BspacingRight%3D3%3Brotatable%3D0%3BlabelPosition%3Dright%3Bpoints%3D%5B%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2216%22%3E%3CmxGeometry%20y%3D%2240%22%20width%3D%22240%22%20height%3D%228%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2218%22%20value%3D%22%2B%20%26lt%3Bfont%20face%3D%26quot%3Bmenlo%26quot%3B%26gt%3B%26lt%3Bspan%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%26quot%3B%26gt%3BgetUserById%26lt%3B%2Fspan%26gt%3B%26lt%3B%2Ffont%26gt%3B%26lt%3Bspan%26gt%3B%3A%20respone%26lt%3Bbr%26gt%3B%26lt%3Bbr%26gt%3B%26lt%3B%2Fspan%26gt%3B%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2216%22%3E%3CmxGeometry%20y%3D%2248%22%20width%3D%22240%22%20height%3D%2226%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2219%22%20style%3D%22edgeStyle%3DorthogonalEdgeStyle%3Brounded%3D0%3BorthogonalLoop%3D1%3BjettySize%3Dauto%3Bhtml%3D1%3BexitX%3D1%3BexitY%3D0.5%3BexitDx%3D0%3BexitDy%3D0%3BentryX%3D0%3BentryY%3D0.5%3BentryDx%3D0%3BentryDy%3D0%3B%22%20edge%3D%221%22%20source%3D%2213%22%20target%3D%2216%22%20parent%3D%221%22%3E%3CmxGeometry%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22770%22%20y%3D%22420%22%20as%3D%22targetPoint%22%2F%3E%3CmxPoint%20x%3D%22710%22%20y%3D%22211.5%22%20as%3D%22sourcePoint%22%2F%3E%3CArray%20as%3D%22points%22%3E%3CmxPoint%20x%3D%22710%22%20y%3D%22137%22%2F%3E%3CmxPoint%20x%3D%22710%22%20y%3D%22401%22%2F%3E%3C%2FArray%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2220%22%20style%3D%22edgeStyle%3DorthogonalEdgeStyle%3Brounded%3D0%3BorthogonalLoop%3D1%3BjettySize%3Dauto%3Bhtml%3D1%3BexitX%3D1%3BexitY%3D0.5%3BexitDx%3D0%3BexitDy%3D0%3B%22%20edge%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22540%22%20y%3D%22600.25%22%20as%3D%22targetPoint%22%2F%3E%3CmxPoint%20x%3D%22400%22%20y%3D%22600.3%22%20as%3D%22sourcePoint%22%2F%3E%3CArray%20as%3D%22points%22%3E%3CmxPoint%20x%3D%22540%22%20y%3D%22600.25%22%2F%3E%3C%2FArray%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2221%22%20value%3D%22%26lt%3Bpre%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3B%26lt%3Bpre%20style%3D%26quot%3Bfont-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BNetAmountCalculator%26lt%3B%2Fpre%26gt%3B%26lt%3B%2Fpre%26gt%3B%22%20style%3D%22swimlane%3Bhtml%3D1%3BfontStyle%3D1%3Balign%3Dcenter%3BverticalAlign%3Dtop%3BchildLayout%3DstackLayout%3Bhorizontal%3D1%3BstartSize%3D40%3BhorizontalStack%3D0%3BresizeParent%3D1%3BresizeLast%3D0%3Bcollapsible%3D1%3BmarginBottom%3D0%3BswimlaneFillColor%3D%23ffffff%3Brounded%3D0%3Bshadow%3D0%3Bcomic%3D0%3BlabelBackgroundColor%3Dnone%3BstrokeWidth%3D1%3BfillColor%3Dnone%3BfontFamily%3DVerdana%3BfontSize%3D12%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%2290%22%20y%3D%22530%22%20width%3D%22310%22%20height%3D%22161.5%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2222%22%20value%3D%22%22%20style%3D%22line%3Bhtml%3D1%3BstrokeWidth%3D1%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dmiddle%3BspacingTop%3D-1%3BspacingLeft%3D3%3BspacingRight%3D3%3Brotatable%3D0%3BlabelPosition%3Dright%3Bpoints%3D%5B%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2221%22%3E%3CmxGeometry%20y%3D%2240%22%20width%3D%22310%22%20height%3D%228%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2223%22%20value%3D%22%2B%26amp%3Bnbsp%3B%26lt%3Bspan%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3Bcalculate(type%2C%20date%2C%20items)%26lt%3B%2Fspan%26gt%3B%26lt%3Bspan%26gt%3B%3A%20BigDecimal%26lt%3Bbr%26gt%3B%26lt%3Bbr%26gt%3B%26lt%3B%2Fspan%26gt%3B%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2221%22%3E%3CmxGeometry%20y%3D%2248%22%20width%3D%22310%22%20height%3D%2226%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2224%22%20value%3D%22%26lt%3Bpre%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3B%26lt%3Bpre%20style%3D%26quot%3Bfont-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BNetAmountCalculatorBase%26lt%3B%2Fpre%26gt%3B%26lt%3B%2Fpre%26gt%3B%22%20style%3D%22swimlane%3Bhtml%3D1%3BfontStyle%3D1%3Balign%3Dcenter%3BverticalAlign%3Dtop%3BchildLayout%3DstackLayout%3Bhorizontal%3D1%3BstartSize%3D40%3BhorizontalStack%3D0%3BresizeParent%3D1%3BresizeLast%3D0%3Bcollapsible%3D1%3BmarginBottom%3D0%3BswimlaneFillColor%3D%23ffffff%3Brounded%3D0%3Bshadow%3D0%3Bcomic%3D0%3BlabelBackgroundColor%3Dnone%3BstrokeWidth%3D1%3BfillColor%3Dnone%3BfontFamily%3DVerdana%3BfontSize%3D12%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22540%22%20y%3D%22540%22%20width%3D%22290%22%20height%3D%2280%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2225%22%20value%3D%22%22%20style%3D%22line%3Bhtml%3D1%3BstrokeWidth%3D1%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dmiddle%3BspacingTop%3D-1%3BspacingLeft%3D3%3BspacingRight%3D3%3Brotatable%3D0%3BlabelPosition%3Dright%3Bpoints%3D%5B%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2224%22%3E%3CmxGeometry%20y%3D%2240%22%20width%3D%22290%22%20height%3D%228%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2226%22%20value%3D%22%2B%26amp%3Bnbsp%3B%26lt%3Bspan%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3Bcalculate(type%2C%20date%2C%20items)%26lt%3B%2Fspan%26gt%3B%26lt%3Bspan%26gt%3B%3A%20BigDecimal%26lt%3Bbr%26gt%3B%26lt%3Bbr%26gt%3B%26lt%3B%2Fspan%26gt%3B%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2224%22%3E%3CmxGeometry%20y%3D%2248%22%20width%3D%22290%22%20height%3D%2226%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2227%22%20value%3D%22%22%20style%3D%22endArrow%3Dnone%3Bhtml%3D1%3BentryX%3D0.467%3BentryY%3D-0.011%3BentryDx%3D0%3BentryDy%3D0%3BentryPerimeter%3D0%3B%22%20edge%3D%221%22%20target%3D%2230%22%20parent%3D%221%22%3E%3CmxGeometry%20width%3D%2250%22%20height%3D%2250%22%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22580%22%20y%3D%22670%22%20as%3D%22sourcePoint%22%2F%3E%3CmxPoint%20x%3D%22660%22%20y%3D%22510%22%20as%3D%22targetPoint%22%2F%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2228%22%20style%3D%22edgeStyle%3DorthogonalEdgeStyle%3Brounded%3D0%3BorthogonalLoop%3D1%3BjettySize%3Dauto%3Bhtml%3D1%3BentryX%3D0.997%3BentryY%3D0.198%3BentryDx%3D0%3BentryDy%3D0%3BentryPerimeter%3D0%3BexitX%3D0.5%3BexitY%3D1%3BexitDx%3D0%3BexitDy%3D0%3B%22%20edge%3D%221%22%20source%3D%2210%22%20target%3D%2221%22%20parent%3D%221%22%3E%3CmxGeometry%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22590%22%20y%3D%22475.75%22%20as%3D%22targetPoint%22%2F%3E%3CmxPoint%20x%3D%22400%22%20y%3D%22354.5%22%20as%3D%22sourcePoint%22%2F%3E%3CArray%20as%3D%22points%22%3E%3CmxPoint%20x%3D%22480%22%20y%3D%22212%22%2F%3E%3CmxPoint%20x%3D%22480%22%20y%3D%22562%22%2F%3E%3C%2FArray%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2229%22%20value%3D%22NetAmountCalculator%20Model%22%20style%3D%22ellipse%3BwhiteSpace%3Dwrap%3Bhtml%3D1%3B%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22910%22%20y%3D%22500%22%20width%3D%22160%22%20height%3D%2280%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2230%22%20value%3D%22%26lt%3Bpre%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3B%26lt%3Bpre%20style%3D%26quot%3Bfont-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BCustomerNetAmountCalculator%26lt%3B%2Fpre%26gt%3B%26lt%3B%2Fpre%26gt%3B%22%20style%3D%22swimlane%3Bhtml%3D1%3BfontStyle%3D1%3Balign%3Dcenter%3BverticalAlign%3Dtop%3BchildLayout%3DstackLayout%3Bhorizontal%3D1%3BstartSize%3D40%3BhorizontalStack%3D0%3BresizeParent%3D1%3BresizeLast%3D0%3Bcollapsible%3D1%3BmarginBottom%3D0%3BswimlaneFillColor%3D%23ffffff%3Brounded%3D0%3Bshadow%3D0%3Bcomic%3D0%3BlabelBackgroundColor%3Dnone%3BstrokeWidth%3D1%3BfillColor%3Dnone%3BfontFamily%3DVerdana%3BfontSize%3D12%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22900%22%20y%3D%22710%22%20width%3D%22390%22%20height%3D%2291%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2231%22%20value%3D%22%22%20style%3D%22line%3Bhtml%3D1%3BstrokeWidth%3D1%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dmiddle%3BspacingTop%3D-1%3BspacingLeft%3D3%3BspacingRight%3D3%3Brotatable%3D0%3BlabelPosition%3Dright%3Bpoints%3D%5B%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2230%22%3E%3CmxGeometry%20y%3D%2240%22%20width%3D%22390%22%20height%3D%228%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2232%22%20value%3D%22%2B%26amp%3Bnbsp%3B%26lt%3Bfont%20face%3D%26quot%3Bmenlo%26quot%3B%26gt%3B%26lt%3Bspan%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%26quot%3B%26gt%3BgetDiscountPercenteageOnNotFroceryItems%3ABigDecimal%26lt%3B%2Fspan%26gt%3B%26lt%3B%2Ffont%26gt%3B%26lt%3Bspan%26gt%3B%26lt%3Bbr%26gt%3B%26lt%3B%2Fspan%26gt%3B%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2230%22%3E%3CmxGeometry%20y%3D%2248%22%20width%3D%22390%22%20height%3D%2226%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2233%22%20value%3D%22%26lt%3Bpre%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3B%26lt%3Bpre%20style%3D%26quot%3Bfont-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BEmployeeNetAmountCalculator%26lt%3B%2Fpre%26gt%3B%26lt%3B%2Fpre%26gt%3B%22%20style%3D%22swimlane%3Bhtml%3D1%3BfontStyle%3D1%3Balign%3Dcenter%3BverticalAlign%3Dtop%3BchildLayout%3DstackLayout%3Bhorizontal%3D1%3BstartSize%3D40%3BhorizontalStack%3D0%3BresizeParent%3D1%3BresizeLast%3D0%3Bcollapsible%3D1%3BmarginBottom%3D0%3BswimlaneFillColor%3D%23ffffff%3Brounded%3D0%3Bshadow%3D0%3Bcomic%3D0%3BlabelBackgroundColor%3Dnone%3BstrokeWidth%3D1%3BfillColor%3Dnone%3BfontFamily%3DVerdana%3BfontSize%3D12%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22480%22%20y%3D%22710%22%20width%3D%22390%22%20height%3D%2290%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2234%22%20style%3D%22edgeStyle%3DorthogonalEdgeStyle%3Bhtml%3D1%3BlabelBackgroundColor%3Dnone%3BstartFill%3D0%3BstartSize%3D8%3BendArrow%3Dblock%3BendFill%3D0%3BendSize%3D16%3BfontFamily%3DVerdana%3BfontSize%3D12%3B%22%20edge%3D%221%22%20parent%3D%2233%22%3E%3CmxGeometry%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22100%22%20y%3D%22-90%22%20as%3D%22sourcePoint%22%2F%3E%3CmxPoint%20x%3D%22100%22%20y%3D%22-100%22%20as%3D%22targetPoint%22%2F%3E%3CArray%20as%3D%22points%22%3E%3CmxPoint%20x%3D%22100%22%20y%3D%2240%22%2F%3E%3C%2FArray%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2235%22%20value%3D%22%22%20style%3D%22line%3Bhtml%3D1%3BstrokeWidth%3D1%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dmiddle%3BspacingTop%3D-1%3BspacingLeft%3D3%3BspacingRight%3D3%3Brotatable%3D0%3BlabelPosition%3Dright%3Bpoints%3D%5B%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2233%22%3E%3CmxGeometry%20y%3D%2240%22%20width%3D%22390%22%20height%3D%228%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2236%22%20value%3D%22%2B%20%26lt%3Bfont%20face%3D%26quot%3Bmenlo%26quot%3B%26gt%3B%26lt%3Bspan%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%26quot%3B%26gt%3BgetDiscountPercenteageOnNotFroceryItems%3ABigDecimal%26lt%3B%2Fspan%26gt%3B%26lt%3B%2Ffont%26gt%3B%26lt%3Bspan%26gt%3B%26lt%3Bbr%26gt%3B%26lt%3B%2Fspan%26gt%3B%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2233%22%3E%3CmxGeometry%20y%3D%2248%22%20width%3D%22390%22%20height%3D%2232%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2237%22%20value%3D%22%22%20style%3D%22endArrow%3Dnone%3Bdashed%3D1%3Bhtml%3D1%3BentryX%3D0%3BentryY%3D1%3BentryDx%3D0%3BentryDy%3D0%3BexitX%3D1%3BexitY%3D0.375%3BexitDx%3D0%3BexitDy%3D0%3BexitPerimeter%3D0%3B%22%20edge%3D%221%22%20source%3D%2225%22%20target%3D%2229%22%20parent%3D%221%22%3E%3CmxGeometry%20width%3D%2250%22%20height%3D%2250%22%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22620%22%20y%3D%22670%22%20as%3D%22sourcePoint%22%2F%3E%3CmxPoint%20x%3D%22670%22%20y%3D%22620%22%20as%3D%22targetPoint%22%2F%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2238%22%20value%3D%22%26lt%3Bpre%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%20%3B%20font-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3B%26lt%3Bpre%20style%3D%26quot%3Bfont-family%3A%20%26amp%3B%2334%3Bmenlo%26amp%3B%2334%3B%20%3B%20font-size%3A%209pt%26quot%3B%26gt%3BAffiliateNetAmountCalculator%26lt%3B%2Fpre%26gt%3B%26lt%3B%2Fpre%26gt%3B%22%20style%3D%22swimlane%3Bhtml%3D1%3BfontStyle%3D1%3Balign%3Dcenter%3BverticalAlign%3Dtop%3BchildLayout%3DstackLayout%3Bhorizontal%3D1%3BstartSize%3D40%3BhorizontalStack%3D0%3BresizeParent%3D1%3BresizeLast%3D0%3Bcollapsible%3D1%3BmarginBottom%3D0%3BswimlaneFillColor%3D%23ffffff%3Brounded%3D0%3Bshadow%3D0%3Bcomic%3D0%3BlabelBackgroundColor%3Dnone%3BstrokeWidth%3D1%3BfillColor%3Dnone%3BfontFamily%3DVerdana%3BfontSize%3D12%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%2280%22%20y%3D%22719.5%22%20width%3D%22380%22%20height%3D%2291%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2239%22%20value%3D%22%22%20style%3D%22line%3Bhtml%3D1%3BstrokeWidth%3D1%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dmiddle%3BspacingTop%3D-1%3BspacingLeft%3D3%3BspacingRight%3D3%3Brotatable%3D0%3BlabelPosition%3Dright%3Bpoints%3D%5B%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2238%22%3E%3CmxGeometry%20y%3D%2240%22%20width%3D%22380%22%20height%3D%228%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2240%22%20value%3D%22%2B%26amp%3Bnbsp%3B%26lt%3Bfont%20face%3D%26quot%3Bmenlo%26quot%3B%26gt%3B%26lt%3Bspan%20style%3D%26quot%3Bbackground-color%3A%20rgb(255%20%2C%20255%20%2C%20255)%26quot%3B%26gt%3BgetDiscountPercenteageOnNotFroceryItems%3ABigDecimal%26lt%3B%2Fspan%26gt%3B%26lt%3B%2Ffont%26gt%3B%26lt%3Bspan%26gt%3B%26lt%3Bbr%26gt%3B%26lt%3B%2Fspan%26gt%3B%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dleft%3BverticalAlign%3Dtop%3BspacingLeft%3D4%3BspacingRight%3D4%3BwhiteSpace%3Dwrap%3Boverflow%3Dhidden%3Brotatable%3D0%3Bpoints%3D%5B%5B0%2C0.5%5D%2C%5B1%2C0.5%5D%5D%3BportConstraint%3Deastwest%3B%22%20vertex%3D%221%22%20parent%3D%2238%22%3E%3CmxGeometry%20y%3D%2248%22%20width%3D%22380%22%20height%3D%2226%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2241%22%20value%3D%22%22%20style%3D%22endArrow%3Dnone%3Bhtml%3D1%3BexitX%3D0.363%3BexitY%3D-0.011%3BexitDx%3D0%3BexitDy%3D0%3BexitPerimeter%3D0%3B%22%20edge%3D%221%22%20parent%3D%2238%22%20source%3D%2238%22%3E%3CmxGeometry%20width%3D%2250%22%20height%3D%2250%22%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%2276%22%20y%3D%22-9%22%20as%3D%22sourcePoint%22%2F%3E%3CmxPoint%20x%3D%22500%22%20y%3D%22-50%22%20as%3D%22targetPoint%22%2F%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3C%2Froot%3E%3C%2FmxGraphModel%3E
### Run the application
1- Clone the repo.
2- From command line open the project directory and run `mvn spring-boot:run`
3- open http://localhost:8080/swagger-ui.html.

### Run test & coverage report
1- Open the terminal.
2- Naviagate to project folder.
3- Run the below maven command
 ~~~~
mvn test
~~~~
Search for _target/site/jacoco/index.html
