#include <wx/wx.h>

class MyFrame : public wxFrame {
public:
  MyFrame(const wxString& title, const wxPoint& pos, const wxSize& size);

private:
  wxButton* button;
  wxTextCtrl* textCtrl;
};

MyFrame::MyFrame(const wxString& title, const wxPoint& pos, const wxSize& size)
  : wxFrame(nullptr, wxID_ANY, title, pos, size) {
  CreateControls();

  Bind(wxEVT_BUTTON, &MyFrame::OnButtonClick, this, button);
}

void MyFrame::CreateControls() {
  button = new wxButton(this, wxID_ANY, "&Click Me");
  textCtrl = new wxTextCtrl(this, wxID_ANY, wxEmptyString, wxDefaultPosition, wxDefaultSize);

  wxBoxSizer* sizer = new wxBoxSizer(wxVERTICAL);
  sizer->Add(button, 0, wxEXPAND);
  sizer->Add(textCtrl, 0, wxEXPAND);
  SetSizer(sizer);
}

void MyFrame::OnButtonClick(wxButtonEvent& event) {
  textCtrl->AppendText("Button clicked!\n");
}

wxIMPLEMENT_APP(MyApp);

bool MyApp::OnInit() {
  MyFrame* frame = new MyFrame("My GUI Page", wxDefaultPosition, wxSize(250, 150));
  frame->Show();
  return true;
}
