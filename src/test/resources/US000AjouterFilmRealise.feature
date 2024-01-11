# Author: Alvarez Clementine
@tag
Feature: US_000 Ajouter un film réalisé par un réalisateur

  En tant que Realisateur
  Je veux ajouter un film que j'ai réalisé, avec le titre, l'année de sortie et le réalisateur,
  Afin de maintenir à jour la liste des films que j'ai réalisés.

  Scenario Outline: Ajout du premier film pour un nouveau réalisateur
    Given un nouveau realisateur et un film avec le titre <titre> et l'année de sortie <anneeSortie>
    Then le film doit être ajouté à la liste des films réalisés par ce réalisateur

    Examples:
      | titre       | anneeSortie |
      | "Wonka"     | 2023        |
      | "The Killer"| 2023        |
      | "Inception" | 2010        |