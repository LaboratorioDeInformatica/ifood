import { Redirect, Route } from 'react-router-dom';
import {
  IonApp,
  IonIcon,
  IonLabel,
  IonRouterOutlet,
  IonTabBar,
  IonTabButton,
  IonTabs,
} from '@ionic/react';
import { IonReactRouter } from '@ionic/react-router';
import { ellipse, square, triangle } from 'ionicons/icons';
import Login from './pages/Login';
import Voucher from './pages/Voucher';

import ReactGuard from './pages/RouterGuard'


/* Core CSS required for Ionic components to work properly */
import '@ionic/react/css/core.css';

/* Basic CSS for apps built with Ionic */
import '@ionic/react/css/normalize.css';
import '@ionic/react/css/structure.css';
import '@ionic/react/css/typography.css';

/* Optional CSS utils that can be commented out */
import '@ionic/react/css/padding.css';
import '@ionic/react/css/float-elements.css';
import '@ionic/react/css/text-alignment.css';
import '@ionic/react/css/text-transformation.css';
import '@ionic/react/css/flex-utils.css';
import '@ionic/react/css/display.css';

/* Theme variables */
import './theme/variables.css';

const App: React.FC = () => (
  <IonApp>
    <IonReactRouter>
     
        <IonRouterOutlet>
          <Route exact path="/">
            <Login />
          </Route>


          <Route  path="/voucher">
            <ReactGuard component={Voucher} />
          </Route>
          <ReactGuard path="/bola">
            <h1>Teste</h1>
          </ReactGuard>



          <Route exact path="/Voucher" render={() => <Login />}>
            <Voucher />
          </Route>
          {/* <Route exact path="/">
            <Redirect to="/Login" />
          </Route> */}
        </IonRouterOutlet>
       
    </IonReactRouter>
  </IonApp>
);

export default App;
