import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/react';
import { useEffect, useState } from 'react';
import './Voucher.css';
import React from 'react'


class Voucher extends React.Component<{}, { email: string, msg: string, valor: number }>{
  email: string

  constructor(props: any) {
    super(props)


    const emailObject = JSON.parse(localStorage.getItem('token') || '')   


    this.email = emailObject.email

    this.state = { email: '', msg: '', valor: 0 }
  }


  getData(parametro: string): Promise<any> {

    return new Promise((resolve, reject) => {
      fetch(`http://localhost:8080/voucher/birthiday-gift/${parametro}`)
        .then(T => T.json())
        .then(t => {

        

          this.setState({ valor: t.value, email: this.email, msg: t.message })

          }
        )
    });


  }


  componentDidMount() {
    this.getData('teste@teste.com.br')
  }


  render() {



    return (
      <IonPage>
        <IonHeader>
          <IonToolbar>
            <IonTitle>Voucher</IonTitle>
          </IonToolbar>
        </IonHeader>
        <IonContent fullscreen>
          <IonHeader collapse="condense">
            <IonToolbar>
              <IonTitle size="large">Voucher</IonTitle>
            </IonToolbar>
          </IonHeader>
          {/* <ExploreContainer name="Tab 3 page" /> */}

          <div className="container">
            <div className="row">
              <div className="col-1 col-md-4"> </div>
              <div className="col-10 col-md-3">

                <div className="messag">

                  <label form="name">Email:</label>
                  <input name="email" readOnly={true} value={this.state.email} type="text" className="form-control" />

                  <span className="sp-msg text-center">Feliz Aniversario você acaba de ganhar um voucher</span>

                  <div className="row">
                    <div className="col-1 col-md-1"></div>
                    <div className="col-10 col-md-10">
                      <div className="voucher-value">
                        <div className="text-center">
                          <p>Valor: <span>R${this.state.valor?.toFixed(2)|| 0}</span></p>
                        </div>

                      </div>

                    </div>
                    <div className="col-1 col-md-10"></div>
                  </div>


                </div>

              </div>
              <div className="col-1 cold-md-4"> </div>

            </div>

          </div>
        </IonContent>
      </IonPage>
    );
  }


}



export default Voucher;
