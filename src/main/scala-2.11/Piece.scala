/**
  * Created by jmarzin-cp on 24/12/2016.
  */
class Piece {
  var dernierePieceDeLaColloc = false
  var colloc : Colloc = new Colloc
  var code = ""
  var etat = ""
  var page = ""
  var resteARecouvrerPrincipal = 0
  var resteARecouvrerFrais = 0
  var dateEmission = ""
  var datePrescription = ""
  val debiteur = new Debiteur
  var rangDansLaPage = 0
  var annee = ""
  var bordereau = ""
}
