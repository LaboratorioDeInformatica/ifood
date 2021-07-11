import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonInput, IonButton } from '@ionic/react';
import React from 'react';
import './Login.css';

import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';



class Login extends React.Component<{}, { value: boolean, class: string }> {
  email: string = 'teste@teste.com.br'
  password: string = ''


  constructor(props: any) {
    super(props)
    this.onSubimit = this.onSubimit.bind(this)
    this.state = { value: false, class: 'shake text-center' }


  }



  // authentication() {
  //   localStorage.setItem('token', 'true');

  // }

  onSubimit(e: any) {   


    // e.preventDefault()



    if (this.email === 'teste@teste.com.br' || this.email === 'fiap@teste.com' || this.email === 'professor@teste.com') {
      const token = { email: this.email }     
      
      localStorage.setItem('token', JSON.stringify(token))

    } else {     
      
      this.setState({ value: true, class: 'shake text-center' });
      e.preventDefault()
    }

  }


  render() {

    let message = null

    if (this.state.value) {
      message = <div className={this.state.class}>Email Inválido</div>

      setTimeout(() => {
        this.setState({ value: this.state.value, class: 'shake-time text-center' })
      }, 1000);
    }

    return (
      <IonPage>
        <IonHeader>
          <IonToolbar>
            <IonTitle size="large">Login Voucher</IonTitle>
          </IonToolbar>
        </IonHeader>
        <IonContent fullscreen>
          <IonHeader collapse="condense">
            <IonToolbar>
              <IonTitle size="large">Voucher</IonTitle>
            </IonToolbar>
          </IonHeader>
          {/* <ExploreContainer name="YTexto que eu posso inserir" /> */}

          <div className="container">
            <div className="row">
              <div className="col-md-4 col-2"></div>

              <div className="col-md-4 col-8">
                <IonInput  onInput={(e: any) => { this.email = e.target.value }} placeholder="Email" ></IonInput>
              </div>
              <div className="col-md-4 col-2"></div>
            </div>

            <div className="row mg-tp">
              <div className="col-md-4 col-2"></div>

              <div className="col-md-4 col-8 ">
                <IonInput onInput={(e: any) => this.password = e.target.value} placeholder="Password" type="password" ></IonInput>


                {/* dentro da div do password */}

                {/* Botão */}
                <div className="row">
                  <div className="col-md-4 col-2"></div>

                  <div className="col-md-4 col-8">
                    <IonButton onClick={this.onSubimit} href="/voucher">Login</IonButton>
                  </div>
                  <div className="col-md-4 col-2"></div>
                </div>

                {/* Senha errada */}

                <div className="row face-row">
                  {message}
                  {/* <div className="col-md-4 col-2"></div>

                  <div className="col-md-4 col-8">
                    {message}
                  </div>
                  <div className="col-md-4 col-2"></div> */}
                </div>




              </div>
              <div className="col-md-4 col-2"></div>
            </div>



          </div>


        </IonContent>
      </IonPage>
    );
  }

}



export default Login;
