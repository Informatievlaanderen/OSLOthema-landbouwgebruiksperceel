# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### [0.1.0] - 2026-08-04

### Added
- Relaties isGeassocieerdMet en isLidVan/lid bij Organisatie om Personen en Organisaties te koppelen.
- ProblemDetail voor HTTP foutcodes bij een REST API volgens RFC9457.
- Datavoorbeelden die alle speciale gevallen testen op het model.

### Fixed
- Alle validatiefouten volgens het weerbericht.

### Changed
- Kardinaliteit identificator GeregistreerdPersoon en GeregistreerdeOrganisatie uitgebreid van 1..1 naar 1..*
- Overlijdensdatum vervangen door een lege Overlijden klasse, conform OSLO Applicatieprofiel Persoon waarbij alle attributen weggelaten zijn.

## [0.0.1] - 2026-06-02

### Added
- Initiële release
